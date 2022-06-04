

var randomNum = Math.floor((Math.random() * 50) + 1);
console.log(randomNum);
var count = 10;
var buttons = document.querySelector('#butt');
var boolvalue = true

const heading = document.querySelector('h1');

buttons.addEventListener('click', (e) => {
    if (e.target.id < 51 && boolvalue && count > 0) {
        //  alert(count);
        count -= 1
        
        if (e.target.id > randomNum)
            e.target.classList.add("buttonRed");
        if (e.target.id < randomNum)
            e.target.classList.add("buttonYellow");
        heading.innerText = `Now you have ${count} Attempts left`;
        if (e.target.id == randomNum) {
            e.target.classList.add("buttonGreen");
            heading.innerText = `You Won, hurrayyyyyyy`;
            boolvalue = false

        }
      //  heading.innerText = `Now you have ${count} Attempts left`;
    }
});