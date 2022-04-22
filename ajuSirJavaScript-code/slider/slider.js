const slid = document.querySelectorAll(".slidebar");

var randomNum = Math.floor((Math.random() * 10) + 1);

const text = document.querySelector('h1');
var count = 6;
var bool = true;
slid[0].addEventListener("click", () => {
    if (count > 0 && bool) {
        console.log(randomNum);
        if (randomNum == slid[0].value) {
            slid[0].setAttribute("class", "slidebar green");
            document.getElementById("runn").disabled = true;
            text.innerText = `You winnnnnnnnn`;
            bool = false;
        }
        if (randomNum < slid[0].value) {

            slid[0].setAttribute("class", "slidebar red");
            text.innerText = `You are currently pointing to score ${slid[0].value} and you have ${count} attempt left`
        }
        if (randomNum > slid[0].value) {
            slid[0].setAttribute("class", "slidebar yellow");
            text.innerText = `You are currently pointing to score ${slid[0].value} and you have ${count} attempt left`
        }
        count--;
    }
    else {
        text.innerText = `you loose `
        document.getElementById("runn").disabled = true;
    }
});
