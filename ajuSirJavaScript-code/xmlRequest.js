const todo = (callback) => {
    const request = new XMLHttpRequest();

    request.addEventListener('readystatechange', () => {
        if (request.readyState == 4 && request.status == 200) {
            //console.log(request, request.readyState);
            const data = JSON.parse(request.responseText);
            callback(undefined, data);
        }
        else if (request.readyState == 4) {
            //console.log("data could not fetch ")
            callback("data not fetch properly", undefined);
        }
    });

    // request.open("GET", "https://jsonplaceholder.typicode.com/todos/");
    request.open("GET", "rohan.json");

    request.send();
};

todo((err, data) => {
    console.log("call back working");
    if (err) {
        console.log(err);
    }
    else {
        (data).forEach(element => {
            console.log(element.title);
            console.log(element.like);
        });
    }
})
