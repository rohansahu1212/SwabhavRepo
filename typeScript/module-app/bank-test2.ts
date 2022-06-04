
import * as ab from "./bank";

let c= new ab.Customer("sachin ", "tendulkar");
let b= new ab.Bank("hdfc","hyderabad");
let a= new ab.Account(2001,50000);

console.log({c,b,a})