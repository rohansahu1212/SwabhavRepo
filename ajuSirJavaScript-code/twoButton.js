// const clickButton = document.querySelector("#buttons")

// clickButton.addEventListener("click", (e) => {
//     const now = new Date();
//     if (e.target.id == 1) {
//         sleep(now.getSeconds());
//         alert("hey wait");
//     }
//     if (e.target.id == 2) {
//         alert(now);
//     }
// });
// function sleep(milliseconds) {
//     alert("in sleep")
//     var start = new Date().getTime();
//     for (var i = 0; i < 1e7; i++) {
//         if ((new Date().getTime() - start) > milliseconds+50000) {
//             break;
//         }
//     }
// }

const greet=()=>{
    console.log('hey');

}
 const showAlert=()=>{
     alert("danger");
 }

 setTimeout(showAlert,2000);
 greet();
 greet();
 greet();