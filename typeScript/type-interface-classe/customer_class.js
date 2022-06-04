var Customer = /** @class */ (function () {
    function Customer(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Object.defineProperty(Customer.prototype, "fullName", {
        get: function () {
            return this.firstName + " " + this.lastName;
        },
        set: function (fullname) {
            var splitted = fullname.split(" ");
            this.firstName = splitted[0];
            this.lastName = splitted[1];
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
var c = new Customer("sachin", "tendulkar");
console.log(c.firstName);
console.log(c.lastName);
console.log(c.fullName);
c.fullName = "rohan sahu";
console.log(c.fullName);
