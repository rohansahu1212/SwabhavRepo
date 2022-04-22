const buttons = document.querySelectorAll("h3")
const text = document.querySelector("h2")
var count = 1;
var bool = true;
buttons.forEach(button => {


    console.log(bool)
    button.addEventListener('click', (e) => {
        if (bool) {
            if (count % 2 == 0 && (e.target.innerText != "X" && e.target.innerText != "O")) {
                e.target.innerText = "X";
                e.target.style.color = "red";
                text.innerText = "player one turn(O)"
                text.style.color = "blue";

                count++;
            }
            else if (e.target.innerText != "X" && e.target.innerText != "O") {
                e.target.innerText = "O";
                e.target.style.color = "green";
                text.innerText = "player two turn(X)"
                count++;
            }
            if (count == 10) {
                bool = false;
                text.innerHTML = "Match Draw";
                text.style.color = "Grey";
            }
            winLogic();
        }

    })

})

const winLogic = () => {
    console.log("winLogic")
    //console.log(buttons[0].innerText,buttons[1].innerText,buttons[2].innerText)
    if (buttons[0].innerText === buttons[1].innerText && buttons[0].innerText === buttons[2].innerText) {
        win();
    }
    if (buttons[3].innerText === buttons[4].innerText && buttons[3].innerText === buttons[5].innerText)
        win();
    if (buttons[6].innerText === buttons[7].innerText && buttons[6].innerText === buttons[8].innerText) {
        win();
    }
    //////vertical
    if (buttons[0].innerText === buttons[3].innerText && buttons[0].innerText === buttons[6].innerText) {
        win();
    }
    if (buttons[1].innerText === buttons[4].innerText && buttons[1].innerText === buttons[7].innerText) {
        win();
    }
    if (buttons[2].innerText === buttons[5].innerText && buttons[2].innerText === buttons[8].innerText) {
        win();
    }

    // daigonal

    if (buttons[0].innerText === buttons[4].innerText && buttons[0].innerText === buttons[8].innerText) {
        win();
    }
    if (buttons[2].innerText === buttons[4].innerText && buttons[2].innerText === buttons[6].innerText) {
        win();
    }
}

const win = () => {

    bool = false;
    text.innerText = "won the game hurray";
    text.style.color = "green";
}