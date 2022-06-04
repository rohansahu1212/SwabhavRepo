import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-ausm',
  templateUrl: './font-ausm.component.html',
  styleUrls: ['./font-ausm.component.css']
})
export class FontAusmComponent implements OnInit {

  @Input()
  rating:number=1;
  @Output()
  ratingClicked:EventEmitter<string>= new EventEmitter<string>();
  constructor() { 
    this.rating=3;
  }

  ngOnInit(): void {
    
  }
  clickHandler(){
    // console.log("event is called")
    this.ratingClicked.emit(`user clicked on ${this.rating}`)
  }

}
