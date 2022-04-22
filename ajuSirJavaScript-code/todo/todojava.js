var addText = document.querySelector('input');

var addList = document.querySelector('#tooList');

addText.addEventListener("keyup", (e) => {
    var text = document.getElementById("toInput").value;

    if (e.keyCode === 13) {
        if (text.trim() === "")
            alert("Task Should Not Be empty")
        else {
            var ul = document.getElementById("tooList");
            var li = document.createElement("li");
            li.className = "list-group-item list-group-item-danger"
            li.appendChild(document.createTextNode(`${text}`));
            ul.prepend(li);
        }
    }

})

const listt = document.querySelector('ul');

listt.addEventListener("click", (e) => {
    if (e.target.name = "li")
        e.target.remove();
})
// addText.addEventListener("click", () => {
//     var text = document.getElementById("toInput").value;

//     var ul = document.getElementById("tooList");
//     var li = document.createElement("li");
//     li.className = "list-group-item list-group-item-danger"
//     li.appendChild(document.createTextNode(`${text}`));
//     ul.appendChild(li);

//     // addList.innerHTML.appendChild(`<li>${text}</li>`);
//     //addList.innerHTML=`<li>${text}</li>`
// })