var student = [{ rollno: 101, firstName: "rohan", marks: [100, 30] },
    { rollno: 201, firstName: "himashu", marks: [90, 80] }];
for (var _i = 0, student_1 = student; _i < student_1.length; _i++) {
    var s = student_1[_i];
    console.log("roll number " + s.rollno);
    console.log("first name " + s.firstName);
    for (var _a = 0, _b = s.marks; _a < _b.length; _a++) {
        var m = _b[_a];
        console.log("mark of " + s.firstName + " " + m);
    }
}
