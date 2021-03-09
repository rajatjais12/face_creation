import React, { useState } from "react";
import Main from "./main";
  
function Extract() {
    
    const [file, setFile] = useState(null);
    const [flag, setFlag] = useState(false);
    const [result, setResult] = useState('');
   
     
    const onFileUpload = () => { 
        var formdata = new FormData();
        formdata.append("file", new Blob([file],{type:'multipart/form-data'}), file.slice(12));

        var requestOptions = {
          method: 'POST',
          body: formdata,
          redirect: 'follow'
        };
        
        fetch("http://127.0.0.1:8000/api/", requestOptions)
          .then(response => response.json())
          .then(result =>{
              setResult(result);
                setFlag(true);
          })
          .catch(error => console.log('error', error));
    }; 



     
      return ( 
        <div> 
            <div className="inp"> 
                <input type="file" accept="image/*" onChange={(e) => setFile(e.target.value)} /> 
                <button onClick={onFileUpload}> 
                  Upload! 
                </button> 
            </div> {
                flag ? 
                
                <Main result={result} />
                : null
            }
        </div> 
      ); 
    } 
  
  export default Extract;