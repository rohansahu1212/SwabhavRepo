var buttonHello = document.getElementById('hello');

buttonHello.addEventListener('click', e => {
    console.log("print value");
    alert("hey");
    document.writeln("print hello");
})

var buttonPrint = document.getElementById('print');
var currentdate = new Date();


buttonPrint.addEventListener('click', e => {
    var myWorker = new Worker('runTime.js');
    myWorker.addEventListener('message', (event) => {
        console.log(`Received message from worker: ${event.data}`)
    });
})