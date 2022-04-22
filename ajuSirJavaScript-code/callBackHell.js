const todo = (resource, callback) => {
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
    request.open("GET", resource);

    request.send();
};

todo("rohan.json", (err, data) => {
    console.log(data);
    todo("rohan2.json", (err, data) => {
        console.log(data);
        todo("rohan3.json", (err, data) => {
            console.log(data);

        })

    })

})
