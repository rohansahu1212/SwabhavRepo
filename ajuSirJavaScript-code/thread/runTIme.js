
var currentdate = new Date();
while(true)
postMessage(currentdate.getHours()+":"+currentdate.getMinutes()+":"+currentdate.getSeconds());
