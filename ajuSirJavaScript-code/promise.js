const doSomething = () => {
    return new Promise((resolve, reject) => {
        //reject("data could not fetch");
        resolve("data successfull")
    });
};

doSomething().then((data) => {
    console.log(data);
}).catch(error=>{
    console.log(error);
})