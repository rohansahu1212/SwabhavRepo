"use strict";
exports.__esModule = true;
exports.Customer = exports.Account = exports.Bank = void 0;
var Bank = /** @class */ (function () {
    function Bank(name, location) {
        this.name = name;
        this.location = location;
    }
    return Bank;
}());
exports.Bank = Bank;
var Account = /** @class */ (function () {
    function Account(accno, balance) {
        this.accno = accno;
        this.balance = balance;
    }
    return Account;
}());
exports.Account = Account;
var Customer = /** @class */ (function () {
    function Customer(firstName, lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }
    return Customer;
}());
exports.Customer = Customer;
