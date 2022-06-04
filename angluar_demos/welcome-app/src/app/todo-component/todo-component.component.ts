import { Component, OnInit } from '@angular/core';
import { Date } from 'mongoose';

@Component({
  selector: 'app-todo',
  templateUrl: './todo-component.component.html',
  styleUrls: ['./todo-component.component.css'],
})
export class TodoComponentComponent implements OnInit {
  task: string = '';
  list: string[] = [];

  constructor() {}

  ngOnInit(): void {}
  todo() {
    const current= new Date();
    this.list.unshift(this.task+"          "+current.toISOString());
    console.log('in todo function  ' + this.task);
    console.log(this.list+"          "+current.toISOString());
  }
}
