import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../data-service.service';

@Component({
  selector: 'student-comp',
  templateUrl: './student-component.component.html',
  styleUrls: ['./student-component.component.css']
})
export class StudentComponentComponent implements OnInit {

  constructor(public service:DataServiceService) {
    console.log(this.service)
    console.log(this.service.getStudentDataMock())
   }

  ngOnInit(): void {
  }

}
