"use strict";
exports.__esModule = true;
var bank_1 = require("./bank");
var c = new bank_1.Customer("sachin ", "tendulkar");
var b = new bank_1.Bank("hdfc", "hyderabad");
var a = new bank_1.Account(2001, 50000);
console.log({ c: c, b: b, a: a });
