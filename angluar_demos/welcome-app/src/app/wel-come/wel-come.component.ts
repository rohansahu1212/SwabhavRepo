import { Component, OnInit } from '@angular/core';
import {
  asyncScheduler,
  interval,
  map,
  observable,
  Observable,
  observeOn,
} from 'rxjs';

@Component({
  selector: 'app-wel',
  templateUrl: './wel-come.component.html',
  styleUrls: ['./wel-come.component.css'],
})
export class WelComeComponent implements OnInit {

  userName: string="rohan sahu";

  goalDetail:Observable<Goal>
  constructor() {
    this.goalDetail=interval(700).pipe(
      map((n) => {
        const t = new Date();
        return new Goal(n,new Date().toString());
      })
    );
  }

  ngOnInit(): void {
    // this.getDataAsync3().subscribe((d) => {
    //   console.log('data arrived');
    //   console.log(d.time);
    //   console.log(d.counter);
    // });
    // this.goalDetail.subscribe((d) => {
    //   console.log(d.time)
    //   console.log(d.count)
    // })
  }
  handRatingClicked(e: any) {
    console.log(e);
    console.log('emitter');
  }
  getDataAsync1(): Observable<number> {
    const observable = new Observable<number>((observer) => {
      observer.next(10);
      observer.next(20);
      observer.next(30);
      observer.next(40);
      observer.next(50);
      observer.complete();
    }).pipe(observeOn(asyncScheduler));
    return observable;
  }
  getDataAsync3(): Observable<any> {
    return interval(300).pipe(
      map((n) => {
        const t = new Date();
        return { time: t, counter: n };
      })
    );
  }
}
export class Goal {
  constructor(public count: number, public time: String) {}
}
