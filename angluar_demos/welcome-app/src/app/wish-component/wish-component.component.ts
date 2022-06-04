import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-wish',
  templateUrl: './wish-component.component.html',
  styleUrls: ['./wish-component.component.css']
})
export class WishComponentComponent implements OnInit {
  userName:string;

  constructor() {
    this.userName="rohan"
   }

  ngOnInit(): void {
  }

}
