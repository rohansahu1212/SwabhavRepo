"use strict";
exports.__esModule = true;
var ab = require("./bank");
var c = new ab.Customer("sachin ", "tendulkar");
var b = new ab.Bank("hdfc", "hyderabad");
var a = new ab.Account(2001, 50000);
console.log({ c: c, b: b, a: a });
