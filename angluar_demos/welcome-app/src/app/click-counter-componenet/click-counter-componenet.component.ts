import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-click',
  templateUrl: './click-counter-componenet.component.html',
  styleUrls: ['./click-counter-componenet.component.css'],
})
export class ClickCounterComponenetComponent implements OnInit {
  btnLabel = 'click me!!';
  btnReset = 'reset';
  counter: number;
  btnStyle = 'btn-default';
  constructor() {
    this.counter = 0;
    console.log('inside constructor');
  }

  ngOnInit(
   
  ){
    this.btnStyle="btn-default"
  }
  update() {
    console.log('inside update and your count is ' + this.counter);
    this.counter += 1;
    
    if (this.counter < 5) {
      this.btnStyle = 'bnt-default';
      console.log('default');
     
    }
    if (this.counter > 5) {
      this.btnStyle = 'btn-change';
      console.log("change")
    }
  }
  reset() {
    this.counter = 0;
    console.log('reset the value');
  }
}
