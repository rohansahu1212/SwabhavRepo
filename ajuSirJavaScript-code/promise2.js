const todo = (resource) => {
    return new Promise((resolve, reject) => {

        const request = new XMLHttpRequest();

        request.addEventListener('readystatechange', () => {
            if (request.readyState == 4 && request.status == 200) {
                //console.log(request, request.readyState);
                const data = JSON.parse(request.responseText);
                resolve(data);
            }
            else if (request.readyState == 4) {
                //console.log("data could not fetch ")
                reject("data not fetch properly");
            }
        });

        // request.open("GET", "https://jsonplaceholder.typicode.com/todos/");
        request.open("GET", resource);

        request.send();

    });
};
todo("rohan.json").then((data) => {
    console.log("1")
    console.log(data);
    return todo("rohan2.json")
}).then((data) => {

    console.log("12");
    console.log(data);
}).catch(error => {
    console.log(error);
})
