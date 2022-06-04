var Student = /** @class */ (function () {
    function Student(_rollno, _name) {
        this._rollno = _rollno;
        this._name = _name;
    }
    Student.prototype.getDetails = function () {
        //function
        return "roll no is " + this._rollno + " name is " + this._name;
    };
    Object.defineProperty(Student.prototype, "name", {
        get: function () {
            return this._name;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "rollno", {
        set: function (no) {
            this._rollno = no;
        },
        enumerable: false,
        configurable: true
    });
    return Student;
}());
var s1 = new Student(101, "rohan");
console.log(s1.name); //using property
console.log(s1.getDetails()); //using function
s1.rollno = 112;
console.log(s1.getDetails()); //using function
