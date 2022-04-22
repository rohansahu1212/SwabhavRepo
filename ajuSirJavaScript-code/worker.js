let sum=0;
self.onmessage=function(message){
  for (let i = 0; i < 1000000000; i++) {
        sum += i;
    }
    postMessage(sum);
   // alert(sum);
}