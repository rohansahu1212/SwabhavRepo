var buttonHello=document.getElementById('hello');

buttonHello.addEventListener('click',e=>{
console.log("print value")
})

var buttonPrint=document.getElementById('print');
var currentdate = new Date(); 
buttonPrint.addEventListener('click',e=>{
  while(true)
    console.log(currentdate.getHours()+":"+currentdate.getMinutes()+":"+currentdate.getSeconds());
})