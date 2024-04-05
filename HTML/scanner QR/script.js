const qrText =document.getElementById('qr-text');
const sizes =document.getElementById('sizes');
const generateBtn =document.getElementById('generateBtn');
const downloadBtn =document.getElementById('downloadBtn');
let size;

const qrContainer =document.querySelector('.qr-body');

generateBtn.addEventListener('click',(e)=>{
    e.preventDefault();   //avoid the refresh again and again
    isEmptyInput();
       
})
     
sizes.addEventListener('change',(e)=>{

    size =e.target.value;
    isEmptyInput();
   
})
downloadBtn.addEventListener('click',(e)=>{
    e.preventDefault();
    let img=document.querySelector('.qr-body img');
    if(img!= null){
        let imgAtrr =img.getAttribute('src');
        downloadBtn.setAttribute("href",imgAtrr);
    }
    else
    {
        downloadBtn.setAttribute("href",`${document.querySelector('canvas').toDataURL()}`)
    }
})

function isEmptyInput()
{if(qrText.value.length>0)
    {
        generateQRCode();
    }
    else{
        alert("enter the text or url to generate the code");
    }

}



function generateQRCode(){

    new QRCode(qrContainer,{
        text:qrText.value,
        height:size,
        width:size,
        colorLight:"#fff",
        colorDark:"#000",
    });
}