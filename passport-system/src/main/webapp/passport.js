function handleRadio(value){
    var loginEmailInput = document.getElementById("loginId");
    if(value=='yes'){
        var emailOutput = document.getElementById("emailId");
        loginEmailInput.value = emailOutput.value;
        loginEmailInput.readOnly = true;
    }else{
        loginEmailInput.readOnly = false;
    }
}

function validateMainName(){
var mainName = document.getElementById("firstNameId").value;
if(mainName.length<4){
document.getElementById("firstNameDisplay1").innerHTML = "**maximum length should be 4**";
document.getElementById("firstNameDisplay2").innerHTML = "";
}else{
    document.getElementById("firstNameDisplay1").innerHTML = "";
}
}

function validateEmail(){
var mail = document.getElementById("emailId").value;
if(mail.length<10){
    document.getElementById("emailIdDisplay1").innerHTML = "**email length should be 10 or more**";
    document.getElementById("emailIdDisplay2").innerHTML = "";
}else{
    document.getElementById("emailIdDisplay1").innerHTML = "";
}
}