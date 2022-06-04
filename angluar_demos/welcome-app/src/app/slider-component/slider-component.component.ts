import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-slider',
  templateUrl: './slider-component.component.html',
  styleUrls: ['./slider-component.component.css'],
})
export class SliderComponentComponent implements OnInit {
  barRange: number;
  minValue: number;
  maxValue: number;
  status: string;
  buttons: number[];
  constructor() {
    this.barRange = 20;
    this.minValue = 1;
    this.maxValue = 50;
    this.buttons = Array.from(
      { length: this.barRange },
      (_, index) => index + 1
    );
    this.status = 'visible';
  }

  ngOnInit(): void {}
  barChange() {
    console.log(this.status);

    this.buttons = Array.from(
      { length: this.barRange },
      (_, index) => index + 1
    );
  }

  clickEvent(e:Event) {
    // alert((e.target as HTMLInputElement).value);
    alert((e.target as HTMLInputElement).value);
  }
}
