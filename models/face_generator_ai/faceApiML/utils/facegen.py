from tensorflow import keras
import os
import numpy as np
import cv2
from keras.preprocessing.image import img_to_array
from keras.layers import Input, Add, Dense, Activation, ZeroPadding2D, BatchNormalization, Flatten, Conv2D, AveragePooling2D, MaxPooling2D, GlobalMaxPooling2D


face_gen_model = keras.models.load_model("./utils/my_gen_gray.h5")

default_image_size=tuple((64, 64))
def convert_image_to_array(image_dir):
    try:
        image = cv2.imread(image_dir)
        image = cv2.cvtColor(image, cv2.cv2.COLOR_BGR2RGB)
        if image is not None :
            image = cv2.resize(image, default_image_size)  
            
            return  img_to_array(image)
        else :
            return np.array([])
    except Exception as e:
        print(f"Error : {e}")
        return None

def CreateFace(dictfile):
    img_arr=[]
    for i in dictfile:
        if i=="id":
            id = dictfile[i]
        else:
            img_url = '.'+dictfile[i]
            img_arr.append(convert_image_to_array(img_url))
    return GenFace(img_arr, id)

def GenFace(files, id):
    ans={}
    files = np.array(files)/255
    print(face_gen_model.summary())
    face_img = face_gen_model.predict((files))
    
    path = './media/faces/'
    fileName = "images"+str(id)+'.jpg'
    cv2.imwrite(os.path.join(path , fileName), face_img)
    ans['face']="http://127.0.0.1:8000"+path[1:]+"/"+fileName
    return ans
