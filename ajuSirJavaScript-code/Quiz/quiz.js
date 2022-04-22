const workArea = document.querySelector("#answer");
//console.log(workArea)
var globalId;

var count = 0;

var score = 0;


const questions = [
    { "question": "what is the capital of india ?", "op1": "chennai", "op2": "delhi", "op3": "kanpur", "op4": "Mumbai", "ans": "delhi" },
    { "question": "what is the capital of japan?", "op1": "heroshima", "op2": "nagasaki", "op3": "tokyo", "op4": "xoxomi", "ans": "tokyo" },
    { "question": "what is the capital of america 2?", "op1": "san deago", "op2": "new jersy", "op3": "washington dc", "op4": "new york", "ans": "washington dc" },
    { "question": "what is the capital of Canada?", "op1": "toronto", "op2": "michigan", "op3": "duruto", "op4": "new masschet", "ans": "toronto" }
]
workArea.addEventListener("click", (e) => {
    let child = workArea.children;
    let idd = e.target.id;
    globalId = idd;
    //console.log(idd)
    Array.from(document.getElementsByClassName("check")).forEach(child => {
        if (idd !== child.id)
            child.checked = false;

    })
})

const nxt = document.querySelector("#next");

nxt.addEventListener("click", () => {
    nxt.innerText = "Next";
    if (count < 4) {
        document.querySelector("h3").innerText = questions[count].question;
        const innerPart = document.querySelector("#answer");

        ansValue();
        innerPart.innerHTML = ` <div class="form-check">
                <input class="form-check-input check" type="checkbox" value="1" id="1" >
                <label class="form-check-label ansValue" for="flexCheckDefault" id="ans1" >
                ${questions[count].op1}
                    
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input check" type="checkbox" value="2" id="2" >
                <label class="form-check-label ansValue" for="flexCheckChecked" id="ans2"  >
                ${questions[count].op2}  
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input check" type="checkbox" value="3" id="3" >
                <label class="form-check-label ansValue" for="flexCheckChecked" id="ans3" >
                ${questions[count].op3}  
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input check" type="checkbox" value="4" id="4" >
                <label class="form-check-label ansValue" for="flexCheckChecked" id="ans4" >
                ${questions[count].op4}
                </label>
            </div>`
        if (count == 3)
            nxt.innerText = "Submit";
    }
    else if (count == 4) {
       
        ansValue();
        nxt.innerText = "Submit";
        if (count == 4) {
            nxt.remove();
            finalScore();
            document.querySelector("h3").innerText = "well Played"
            const innerPart = document.querySelector("#answer");
            innerPart.innerHTML = `<h2>you score ${score} out of ${questions.length}</h2>`
        }
    }


    count++;

})

const ansValue = () => {
    // alert("hey");
    var checkItem = 0;

    Array.from(document.getElementsByClassName("check")).forEach(child => {

        if (child.checked == true) {
            if (document.getElementById(`ans${child.id}`).innerText === questions[count - 1].ans) { //get inner html 
                console.log(document.getElementById(`ans${child.id}`).innerText === questions[count - 1].ans) //get inner html 
                score++;
            }


        }
        else
            checkItem++;

    })

    if (checkItem == 4) {
        alert("check any boxes");
        count--;
    }
}
const finalScore = () => {
    alert("your final score is " + score + " out of " + questions.length);
}
