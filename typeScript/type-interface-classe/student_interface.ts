interface IStudent {
  rollno: number;
  firstName: string;
  lastName?: string;
  marks: number[];
}

let student: IStudent[] = [{ rollno: 101, firstName: "rohan" ,marks:[100,30]},
                            {rollno:201,firstName:"himashu", marks:[90,80]}];

for (const s of student) {
    console.log("roll number "+s.rollno)
    console.log("first name "+ s.firstName)
    for (const m of s.marks) {
        console.log("mark of "+s.firstName +" "+m)
    }
}