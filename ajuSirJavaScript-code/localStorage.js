// localStorage.setItem("name","rohan");
// localStorage.setItem("name2","rohan2");
// localStorage.setItem("name3","rohan3");
// localStorage.setItem("age",24);
// localStorage.setItem("isAdult",true);


// localStorage.removeItem("name2");
// localStorage.removeItem("name3");

// localStorage.clear();

// localStorage.name="rohan1212"//////// another way adding data

const players = [
    { "name": "rohan", "age": 23 },
    { "name": "mohan", "age": 23 },
    { "name": "sohan", "age": 23 },
    { "name": "zohan", "age": 23 }
]

localStorage.setItem("players", JSON.stringify(players));

const data = localStorage.getItem("players")
console.log(data);

const playerdata= JSON.parse(data);

console.log(playerdata);