// let score =100
// console.log(score, typeof score)

//const moment = require("moment");

// const { header } = require("express/lib/request");

// const { add } = require("nodemon/lib/rules");

// // score = "rohan"

// // console.log(score, typeof score)


// // console.log(name)

// // var name="rohan"
// let email = "indiaismycountry@gmail.com";

//1. Convert to uppercase
//2. find the index of @
//3. find all characters after@
//4. extract country from email

// email1=email.toUpperCase()


// console.log(email.indexOf("@"))
// console.log(email1)

// let domain = email.substring(email.indexOf('@') + 1);

// var countryname=email.substring(9,email.indexOf("@"))

// console.log(domain);
// console.log(countryname)

// let repStr= email.replace('a','v');
// console.log(repStr);

// let repStaALl = email.replaceAll('a','v');
// console.log(repStaALl)

// var name = 'atomic habit';
// var author = 'rohan';
// var sales = 700000;

// var templateStr = `book name ${name} written by ${author} is sold over ${sales}`;
// console.log(templateStr);

// let players = ['Sachin', 'Virat', 'Rohit', 'Mayank'];

// console.log(players);

// //find the length of players
// console.log(players.length);
// //generate a string of all players seperated by - Sachin-Virat...
// console.log(players.join("-"))
// //add ['Pant','Dinesh'] to player array

// let players2=['rohan','shikhar']
// players=players.concat(players2);
// console.log(players);
// //add 'Ishan' to array

// players=players.concat("dhoni");
// console.log(players);


// let val=null;

// let val2;

// console.log(val+10+" Ligth will win "+20);

// console.log(val2+10);

// function rohanRun(){
//     console.log("rohan is runnning");
// }

// rohanRun()

// var shirkharRun= function(){
//     return"shikhar is running ";
// };

// console.log(shirkharRun())

// const greet=function(name,time){
//     console.log("hello " +name+" at "+time)
// }
// greet("rohan","night")

// const myFunc = func => {
//     let value = 880;
//     func(value)
// };

// let callBack = function (val) {
//     console.log(val);
// }

// myFunc(val => {
//     console.log(val);
// });

let players=[{"name":'rohan'},{"name":'sachin'},{"name":'ankit'},{"name":'kapil'}];

players.forEach((player,playIndex)=>{
    console.log(player.name);
 });
// let employee = {
//     name: "rohan sahu",
//     age: 12,
//     email: "rohansahu1212gmail.com",
//     project: ['voice assistant', 'gam website', 'chess game'],
//     articles: [{
//         title: "rohan biograpghy",
//         likes: 2000

//     },
//     {
//         title: "sachin biograpghy",
//         likes: 200000

//     },
//     {
//         title: "kapil biograpghy",
//         likes: 20

//     }],
//     plays: function () {
//         console.log("rohan playing chess")
//     },
//     logProjects: function () {
//         console.log("list of project")

//         this.project.forEach(project => {
//             console.log(project)
//         })
//     }
// };

// console.log(employee.name)
// console.log(employee.age)
// console.log(employee.email)
// console.log(employee.project)
// console.log(employee.plays())

// employee.articles.forEach(article=> {
//     console.log(article.title)
//     console.log(article.likes)
// });




//     title: "rohan biograpghy",
//     likes: 2000

// },
// {
//     title: "sachin biograpghy",
//     likes: 200000

// },
// {
//     title: "kapil biograpghy",
//     likes: 20

// }
// ]

// articles.forEach(article => {
//     console.log(article.title)
//     console.log(article.likes)
// // });


// let value=1212.12

// console.log(Math.floor((Math.random() * 100) + 1))
// console.log(~~value)
// console.log(Math.ceil(value))
// console.log(Math.floor(value))

//

// const h3ref = document.querySelectorAll('h1')

// console.log(h3ref);

// h3ref.forEach(heading => {
//     heading.innerText += "more content";
// });
// let players = ['Sachiiin', 'Virat', 'Rohit', 'Mayank'];

// let html=``

// players.forEach(player=>{
//     html+=`<li>${player}</li>`
// })
// let playerlist= document.querySelector('ul')
// playerlist.innerHTML=html;
// let websites = [
//     ["facebook", "facebook.com"],
//     ["google", "google.com"],
//     ["w3school", "w3school.com"],
//     ["javatpoint", "javatpoint.com"]
// ];

// html = ``;
// //console.log(websites);
// addLink = document.querySelector('div');
// console.log(addLink)

// websites.forEach(website => {
//     html += `<a href="${website[1]}">${website[0]}<br></a>`;

// });
// console.log(html);
// addLink.innerHTML=html;

// let para = document.querySelector('p')
// console.log(para);

// let para2 = document.querySelector('p.error')
// console.log(para2);


// let para3 = document.querySelector('p#loca')
// console.log(para3);

// let para4 = document.querySelector('div.error')
// console.log(para4);
//////////////////////////////////////////////////////////
// let players = [
//     {
//         name: 'rohan',
//         age: 26,
//         run: 4000,
//         wickets: 40
//     },
//     {
//         name: 'Ankit',
//         age: 56,
//         run: 5600,
//         wickets: 12
//     },
//     {
//         name: 'sehwag',
//         age: 56,
//         run: 4300,
//         wickets: 240
//     },
//     {
//         name: 'gautam',
//         age: 35,
//         run: 40300,
//         wickets: 412
//     },
// ];
// addPlayerS = document.querySelector('tbody.studentTable');
// html=``
// var numm=1;
// players.forEach(player=>{
//     html+=`<tr><td>${numm}</td>  <td>${player.name}</td> <td>${player.age}</td><td>${player.run}</td><td>${player.wickets}</td></tr>`
//     numm=numm+1;
// });

// addPlayerS.innerHTML=html;


//  const link=document.querySelector('a');


//  link.setAttribute("href","https://www.google.com");
//  link.setAttribute("class","error");
//  link.innerText="google";

// const para=document.querySelector('p');

// console.log(para.classList)
//  para.classList.remove("error")
//  para.classList.add("success")

// const para = document.querySelectorAll('p');

// para.forEach(element => {
//     if (element.innerText.includes("error"))

//         element.classList.add("error")

//     if (element.innerText.includes("success"))
//         element.classList.add("success")


// });

// const title = document.querySelector('h1');

// title.addEventListener('click', () => {
//     title.classList.toggle('error')
// });


// const para = document.querySelector('.current');

// const area = document.querySelector('#area1');

// area.addEventListener('input',()=>{
//     para.innerText=area.value.replace(/[^a-zA-Z ]/g, "");
// } )


//keyup
//input

///// parent

// const  article= document.querySelector("article");
// console.log(article)

// Array.from(article.children).forEach(child=>{
//     child.classList.add("error")
// });

// const para= document.querySelector('p');

// console.log("count "+para.childElementCount)
// console.log(para.parentElement)
// console.log(para.nextElementSibling)
// console.log(para.nextElementSibling.nextElementSibling)



/////// day 4////////////////////////////


//array function

// const scores = [10, 30, 40, 20, 25, 50, 35];
// let filteredArray = scores.filter(score => score >= 30);

// // scores.forEach(score => {
// //     if (score >= 30)
// //         filteredArray.push(score);
// // });

// console.log(filteredArray)


// const users = [
//     { name: "Jay", premium: true },
//     { name: "Roy", premium: false },
//     { name: "Lee", premium: true },
//     { name: "Jan", premium: false },
//     { name: "Tim", premium: true }
// ];

// const premiumUser = users.filter(user => user.premium);

// console.log(premiumUser)

///////////////map method ////////////////

// const prices = [100, 300, 400, 200, 250, 500, 350];
// let discountPrices = [];

// discountPrices = prices.map(price => price * 0.5)

// // prices.forEach(price=>{
// //     discountPrices.push(price/2);
// // })


// console.log(discountPrices)
// console.log(prices)

// const products = [
//     { name: "Good night", price: 350 },
//     { name: "Maggi", price: 70 },
//     { name: "Rice", price: 560 },
//     { name: "Biscuit", price: 50 },
//     { name: "Shoe", price: 900 }
// ];

// // let discPrice = [];
// // discPrice = products.map(product => {
// //     if (product.price >= 500)
// //         return { name: product.name, price: product.price * 0.7 };
// //     return product;
// // })
// products.sort((a, b) => a.name.localeCompare(b.name));
// console.log(products)

// const prices=[2,5,50,12,34,23,19,45,65,42];

// prices.sort((a,b)=>a-b);

// console.log(prices)

//reduce()

// const scores = [2, 5, 50, 12, 60, 72, 34, 23, 19, 45, 65, 42, 19, 34];

// const result = scores.reduce((accum, score) => {
//     if (score >= 30)
//         accum++;
//     return accum;
// }, 0);

// console.log(result);

///// day 5

//
// const now = new Date();

// console.log("today's date " + now.getDate() + "-" + (now.getMonth() + 1) + "-" + now.getFullYear());

// const now = new Date();

// console.log(now)
// console.log(now.toLocaleDateString());
// console.log(now.toLocaleTimeString());
// console.log(now.toTimeString());

// const before= new Date("February 20 2019 7:30:59");

// const lastLogin = Math.abs(before - now);
// let diffDay=Math.floor(lastLogin/ (1000 * 60 * 60 * 24))
// console.log(diffDay)

// var hrs = document.getElementById('hrs');
// console.log(hrs < 10)
// var mins = document.getElementById('mins');
// var secs = document.getElementById('secs');

// const time = () => {
//     var now = new Date();

//     hrs.textContent = `${now.getHours()}`
//     mins.textContent = `${now.getMinutes()}`
//     secs.textContent = `${now.getSeconds()}`

// }

// setInterval(time, 1000);
const now = new Date();
const before = new Date("April 11 2022 15:31:59");

 console.log(dateFns.distanceInWords(now, before, { addSuffix: true }));
// console.log(dateFns.distanceInWords(before, now, { addSuffix: true }));  

// console.log("1");
// console.log("2");
// setTimeout(() => {
//     console.log("call back");
// }, 0000);
// console.log("3");
// console.log("4");
// console.log("5");
// console.log("6");
// console.log("7");
 console.log(dateFns.format(now, 'dddd D MMMM YYYY hh:mm:ss'));