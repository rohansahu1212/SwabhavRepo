
function outerFunction(outerVariable){
    const outerMore="hello";
    return (innerVariable)=>{
        console.log("outer variable " +outerVariable);
        console.log("inner variable " +innerVariable);
        console.log("outer variable " +outerMore);
    }
}

const myFunction= outerFunction("outsideeeee");

myFunction("insideeeeee");