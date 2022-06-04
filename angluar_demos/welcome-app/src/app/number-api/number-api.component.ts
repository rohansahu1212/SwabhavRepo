import { Component, OnInit } from '@angular/core';
import { NumberApiService } from '../number-api.service';

@Component({
  selector: 'number-api',
  templateUrl: './number-api.component.html',
  styleUrls: ['./number-api.component.css'],
})
export class NumberApiComponent implements OnInit {
  fact: string = '';
  url: string = 'http://numberapi.com/' + this.fact + '?.json';
  output: string;
  constructor(public service: NumberApiService) {
    // console.log("inside number api cons")
    // console.log(http);
     this.output = '';
  }

  btnFactsClick() {
    console.log('hey');
    console.log(this.fact);
    this.url= 'http://numberapi.com/' + this.fact + '?.json';

    this.service.getFact(this.fact).subscribe(d=>{
      console.log(d.text)
      this.output=d.text;
    })



        console.log("end of click")
    }
  
  ngOnInit(): void {}
}
