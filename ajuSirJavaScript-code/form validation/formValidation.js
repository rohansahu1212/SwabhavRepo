function validate() {
    alert("hey +1")
    var email = document.getElementById('email').value;
    var pass = document.getElementById('pass').value;

    if (localStorage.getItem(email)) {
       // alert("value hai "+localStorage.getItem(email));
        if(localStorage.getItem(email)===pass){
            localStorage.setItem("name",email);
            alert("done")
            return true;

        }
        else{
            alert("password not match")
            return false;
        }
        

    }
    else
        alert("no user found");
    return false;
}