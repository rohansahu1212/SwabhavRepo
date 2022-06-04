import { Component, OnInit } from '@angular/core';
import { MathServiceService } from '../math-service.service';

@Component({
  selector: 'app-mono-emp',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  numlist:number[]
  constructor(public service:MathServiceService) {
    this.numlist=service.getRandomEvenNos(10);
   }

  ngOnInit(): void {
    this.numlist=this.service.getRandomEvenNos(10);
    console.log(this.numlist)
  }
  getArray(size:number){
    return new Array<number>(size);
  }

}
