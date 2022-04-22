var name=localStorage.getItem("name")
document.querySelector("h1").innerText+=" "+name;
localStorage.removeItem("name");