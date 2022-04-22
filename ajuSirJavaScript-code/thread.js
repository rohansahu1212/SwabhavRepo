const worker= new Worker("worker.js")
const sumButton = document.getElementById("sum");
const bgButton = document.getElementById("bgColor");

sumButton.addEventListener("click", e => {
    worker.postMessage("hello rohan");
    // let sum = 0;
  

});

worker.onmessage=(msg)=>{
    alert("final sum is "+msg.data);
}

bgButton.addEventListener('click', () => {
    if (document.body.style.background !== "green")
        document.body.style.background = "green";
    else
        document.body.style.background = "blue";
})