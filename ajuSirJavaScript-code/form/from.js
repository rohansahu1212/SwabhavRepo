function validate() {
    var username = document.getElementById("username").value;
    var email = document.getElementById("email").value;

    //bool
    var regexuser = /^([a-zA-Z0-9_]+)$/;
    var regexemail = /^([a-zA-Z0-9_\.]+)@([a-zA-z0-9-]+).([a-zA-Z]{2,20})$/;



    if (regexuser.test(username)) {
        //  alert("valid username")

    }
    else {
        alert("not valid username");
        return false;
    }

    if (regexemail.test(email)) {

    }
    else {
        alert("not valid email");
        return false;
    }

    var pass = document.getElementById("pass").value;
    var cpass = document.getElementById("cpass").value;
    var regxpass = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    if(!regxpass.test(pass)){
        alert("pass contain length 6 should contain upper case and lower case");
        return false;
    }
    if (pass.trim() == "") {
        alert("enter password");
        return false;
    }
    if (pass != cpass) {
        alert("password not match");
        return false;
    }
    else {
        return true;
    }

}