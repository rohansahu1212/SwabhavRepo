import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './model/Stundent';

@Injectable({
  providedIn: 'root',
})
export class DataServiceService {
  students: Student[] = [
    { rollnumber: 1, firstName: 'Ram', lastName: 'sahu' },
    { rollnumber: 2, firstName: 'ankit', lastName: 'pandey' },
    { rollnumber: 4, firstName: 'shitik', lastName: 'omar' },
    { rollnumber: 5, firstName: 'shobhi', lastName: 'vijay' },
  ];

  constructor() {
    console.log('data service constructor');
  }

  getStudentDataMock(): Student[] {
    return this.students;
  }

  // getStudents():Observable <Student[]>{
  //   return Observable.create(observer => {
  //     this.http.get('http://users.org').map(response => response.json();
  // })
}
