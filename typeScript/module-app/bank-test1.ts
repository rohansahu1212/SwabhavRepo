import { Account,Customer,Bank } from "./bank";

let c= new Customer("sachin ", "tendulkar");
let b= new Bank("hdfc","hyderabad");
let a= new Account(2001,50000);

console.log({c,b,a})