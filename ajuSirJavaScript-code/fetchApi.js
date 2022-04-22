fetch("rohansahu.json").then((response) => {
    console.log(response);
    console.log(response.json());
    return response.json();
}).then((data) => {
    console.log(data);
}).catch((error) => {
    console.log("eerorrrrrrr",error);
})