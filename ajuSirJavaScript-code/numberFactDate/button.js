var addText = document.querySelector('input');

var addList = document.querySelector('#tooList');

var addData = "";


addText.addEventListener("keyup", (e) => {
    var text = document.getElementById("toInput").value;

    if (e.keyCode === 13) {
        if (findLocalStorage(text)) {
            if (text.trim() === "")
                alert("Task Should Not Be empty")
            else {
                var url = "http://numbersapi.com/" + text
                fetch(url).then(data => {
                    //   console.log("hey", data);
                    return data.text();
                })
                    .then(data => {
                        console.log(typeof data);
                        const now = new Date;
                        addData = data + ", " + dateFns.format(now, 'MMMM D YYYY HH:mm:ss');
                        localStorage.setItem(text, addData);
                        //   alert("hey")
                        listAdd(text);
                    }).catch(error => {
                        console.log(error)

                    })

            }
        }
    }

})

function findLocalStorage(text) {
    

    var value = localStorage.getItem(text);
    if (value == null) {
        alert("New Record")
        return true;
    }
    else {


        var prevtime = value.split(",");
        const now = new Date;
        const before = new Date(prevtime[prevtime.length - 1]);

        alert("you searched this " + dateFns.distanceInWords(now, before, { addSuffix: true }));
        // console.log(dateFns.distanceInWords(now, before, { addSuffix: true }) + "-------------")
        // console.log(dateFns.distanceInWords(now, before, { addSuffix: true })+"----------");
        // console.log(now.getFullYear()+ "-------------")
        return false;
    }
}

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
    // var lab = document.createElement("label");
    const now = new Date;
    li.appendChild(document.createTextNode(`${addData}`));
    //  lab.appendChild(document.createTextNode(`${now.getHours()}:${now.getMinutes()}:${now.getSeconds()}`));
    console.log(typeof now.getTime());
    //ul.prepend(lab);
    ul.prepend(li);


}

const listt = document.querySelector('ul');

listt.addEventListener("click", (e) => {
    // if (e.target = "li")
    //     e.target.remove();
    //localStorage.clear();
    var num = e.target.innerHTML;
    var numsplit = num.split(" ");
    alert(numsplit[0] + " is removed");
    localStorage.removeItem(numsplit[0]);
    e.target.remove();
})

