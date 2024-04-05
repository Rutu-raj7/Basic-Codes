
const submitBtn=document.getElementById('submitBtn');
const nameError = document.getElementById('nameError');
const passError = document.getElementById('passError');
const emailError =document.getElementById('emailError');

submitBtn.addEventListener('click',(e)=>{
e.ProgressEvent();

if(validateName() && validateEmail() && validatePassword() {
    alert("Form Submitted Successfully");

}

});

function validateName(){
    let name=document.getElementById('name').value;
    if(name.length=0)
    {
        nameError.innerHTML="name is required";
        return false;
    }
    if(name.match(/^[A-Za-z]*\s{1}[A-Za-z]*$/)){
        nameError.innerHTML="Write full name";
        return false;
    }
    nameError.innerHTML="Write full name";
    return true;
}
/*
function validateEmail(){
     let emailError.previousElementsibling.classList.add('fa-check');
}


function validateEmail(){
    let email=document.getElementById('email').value;

    if(email.length == 0){
        emailError.innerHTML="emial is required";
        emailError.previousElementSibling.classList.add('fa-xmark');
        return false;
    }
    if(!email.match(/^\w+([\.-]?\w+)*)@\w+([\.-]?\w)*(\.\w{2,3})+$/)){

        emailError.innerHTML="enter the valid email";
        emailError.previousElementsibling.classList.add('fa-check');
        return false;
    }
    emailError.innerHTML="";
    emailError.innerHTML="enter the valid email";
        emailError.previousElementsibling.classList.add('fa-check');
        return false;

}
*/
/*
function validatePassword(){
    let password=document.getElementById('password').value;

    if(password.length == 0){
        passError.innerHTML="emial is required";
        passError.previousElementSibling.classList.add('fa-xmark');
        return false;
    }
    if(!email.match(/^(?=.\d) (?=. *[a-z])(?=. *[A-Z])(?=, [*a-zA-Z0-91) (21.\s) - {8,30}$/)){
        passError. innerHTML = "Password;)){
        passError.previousElementsibling.classList.add('fa-check');
        return false;
    }
      passError.innerHTML="";
       passError.previousElementsibling.classList.add('fa-check');
        return false;

}     */



function validateEmail(){
    let email = document.getElementById('email').value;

    if(email.length === 0){
        emailError.innerHTML = "Email is required";
        return false;
    }
    if(!email.match(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/)){
        emailError.innerHTML = "Enter a valid email address";
        return false;
    }
    emailError.innerHTML = "";
    return true;
}


function validatePassword(){
    let password = document.getElementById('password').value;

    if(password.length === 0){
        passError.innerHTML = "Password is required";
        return false;
    }
    if(password.length < 8 || password.length > 30){
        passError.innerHTML = "Password must be between 8 and 30 characters";
        return false;
    }
    if(!password.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,30}$/)){
        passError.innerHTML = "Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character";
        return false;
    }
    passError.innerHTML = "";
    return true;
}

