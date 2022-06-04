class Student {
  constructor(private _rollno: number, private _name: string) {}
  getDetails() {
    //function
    return "roll no is " + this._rollno + " name is " + this._name;
  }
  get name() {
    // property
    return this._name;
  }

  set rollno(no: number) {
    this._rollno = no;
  }
}

let s1: Student = new Student(101, "rohan");

console.log(s1.name); //using property
console.log(s1.getDetails()); //using function
s1.rollno = 112;
console.log(s1.getDetails()); //using function
