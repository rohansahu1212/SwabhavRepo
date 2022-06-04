import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ball',
  templateUrl: './ballblue.component.html',
  styleUrls: ['./ballblue.component.css']
})
export class BallblueComponent implements OnInit {

  minValue:number;
  maxValue:number;
  range:number;
  constructor() { 
    this.minValue=20;
    this.maxValue=50;
    this.range=20;
  }

  ngOnInit(): void {
  }
  clickEvent(){
    
  }

}
