var students = []

fetch("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students").then((response) => {
    console.log(response);
    return response.json();
}).then((data) => {
    console.log("heyyyyyyyyyyyyyyyyy");

    // console.log(data);
    students = data;
    studentDetails();
}).catch((error) => {
    console.log("eerorrrrrrr", error);
})

//console.log(Students);
var id=1;



const studentDetails = () => {
    var studentTable = document.getElementById("studentTable")
    students.forEach(student => {
        if(student.rollNo!==0){
       studentTable.innerHTML+=` <tr>
       <td>${id}</td>
       <td>${student.name}</td>
       <td>${student.rollNo}</td>
       <td>${student.age}</td>
       <td>${student.email}</td>
       <td>${student.date}</td>
     </tr>`;
     id++;
        }
       //
    })
    document.querySelector("h1").innerText+=" student count "+id;
}