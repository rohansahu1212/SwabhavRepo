const submit = document.getElementById("submit");

submit.addEventListener('click', () => {
    const selct = document.getElementById('select1').value;

    const dates = document.getElementById("datetime").value;
    alert(selct + " " + dates);
     document.body.style.background = selct;
 
})