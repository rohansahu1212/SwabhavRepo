
var submit = document.getElementById("submit");



submit.addEventListener("click", () => {
    var name = document.getElementById("input1").value;
    var email = document.getElementById("input2").value;
    var date = document.getElementById("input3").value;
    var data = {
        "name": name,
        "email": email,
        "date": date
    }
    const url = 'http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students';


    let fetchData = {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json',
        }

    }

    console.log(JSON.stringify(data))
    fetch(url, fetchData)
        .then(result => {
            console.log(result)
            return result.json();
        }).then(console.log
        ).catch(err => {
            console.log(err);
        })

});
