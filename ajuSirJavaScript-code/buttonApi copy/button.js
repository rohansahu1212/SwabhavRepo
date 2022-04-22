var addText = document.querySelector('input');

var addList = document.querySelector('#tooList');

var addData = "";


addText.addEventListener("keyup", (e) => {
    var text = document.getElementById("toInput").value;

    if (e.keyCode === 13) {
        if (text.trim() === "")
            alert("Task Should Not Be empty")
        else {
            var url = "http://numbersapi.com/" + text
            todo(url).then(data => {
                console.log(typeof data);
                addData = data;
                listAdd(text);
            }).catch(error => {
                console.log(error)
                
            })

        }
    }

})

function listAdd(text) {
    var ul = document.getElementById("tooList");
    var li = document.createElement("li");
    if (text % 2 == 0) {
        li.className = "list-group-item list-group-item-success";
    }
    else {
        li.className = "list-group-item list-group-item-warning";
    }
    var url = "http://numbersapi.com/" + text;
    var lab = document.createElement("label");
    const now = new Date;
    li.appendChild(document.createTextNode(`${addData}`));
    lab.appendChild(document.createTextNode(`${now.getHours()}:${now.getMinutes()}:${now.getSeconds()}`));
    console.log(typeof now.getTime);
    ul.prepend(lab);
    ul.prepend(li);
   

}

const listt = document.querySelector('ul');

listt.addEventListener("click", (e) => {
    if (e.target = "li")
        e.target.remove();
})

const todo = (resource) => {
    return new Promise((resolve, reject) => {

        const request = new XMLHttpRequest();

        request.addEventListener('readystatechange', () => {
            if (request.readyState == 4 && request.status == 200) {

                const data = request.responseText;
                resolve(data);
            }
            else if (request.readyState == 4) {

                reject("data not fetch properly");
            }
        });

        request.open("GET", resource);

        request.send();

    });
};