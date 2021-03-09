import face_recognition
import cv2
import os 
import glob


def storeImages(landmarks):
    ans={}
    try:
        for landmark in landmarks:
            path = './media/output/'+landmark
            fileName = landmark+str(landmarks[landmark][1])+'.jpg'
            try: 
                os.makedirs(path, exist_ok = True) 
            except OSError: 
                pass
            cv2.imwrite(os.path.join(path , fileName), landmarks[landmark][0])
            ans[landmark]="http://127.0.0.1:8000"+path[1:]+"/"+fileName
        return ans
    except:
        return "something went wrong"


def extractNose(face_landmarks_list, image, p):
    slist1, flist2 = [], []
    for i in face_landmarks_list[0]["nose_bridge"]:
        slist1.append(i[1])
    for i in face_landmarks_list[0]["nose_tip"]:
        flist2.append(i[0])
    x1 = min(flist2)-p
    x2 = max(flist2)+p
    y1 = min(slist1)-p
    y2 = max(slist1)+p
    imgCrop = image[y1:y2,x1:x2]
    return imgCrop, 'nose'

def extractLip(face_landmarks_list, image, p):
    flist1, slist1, flist2, slist2 = [], [], [], []
    for i in face_landmarks_list[0]["top_lip"]:
        flist1.append(i[0])
        slist1.append(i[1])
    for i in face_landmarks_list[0]["bottom_lip"]:
        flist2.append(i[0])
        slist2.append(i[1])
    x1=max(min(flist1), min(flist2))-p
    x2=max(max(flist1), max(flist2))+p
    y1=min(min(slist2), min(slist2))-p
    y2=max(max(slist1), max(slist2))+p
    imgCrop = image[y1:y2,x1:x2]
    return imgCrop, 'lip'
    
def defaultExtract(face_landmarks_list, image, f, p):
    flist, slist = [], []
    for i in face_landmarks_list[0][f]:
        flist.append(i[0])
        slist.append(i[1])
    x1 = min(flist)-p
    x2 = max(flist)+p
    y1 = min(slist)-p
    y2 = max(slist)+p
    imgCrop = image[y1:y2,x1:x2]
    return imgCrop
    
def extraction(inUrl, id):
    j=id
    print(j)
    img = "./media/img/"+inUrl
    print("image name", img)
    image = cv2.imread(img)
    face_landmarks_list = face_recognition.face_landmarks(image)
    fields={}
    for f in face_landmarks_list[0]:
        imgCopy = image.copy()
        if 'nose' in f:
            imgCrop, f = extractNose(face_landmarks_list, imgCopy, 10)
        elif 'lip' in f:
            imgCrop, f = extractLip(face_landmarks_list, imgCopy, 10)
        else:
            imgCrop = defaultExtract(face_landmarks_list, imgCopy, f, 5)
        fields[f] = [imgCrop, j]
    
    return fields