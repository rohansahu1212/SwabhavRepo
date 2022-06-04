import { Component, OnInit, Pipe, PipeTransform } from '@angular/core';
import { Company } from './company';
@Component({
  selector: 'mono-home',
  templateUrl: './home.component.html',
  // styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  company: Company;
  constructor() {
    this.company = new Company();

    
  }
  ngOnInit() {
    console.log("second init constructor created")
    setTimeout(() => {
      this.company.name = 'swabhav';
    }, 5000);
  }
}
// @Pipe({ name: 'keys',  pure: false })
// export class KeysPipe implements PipeTransform {
//     transform(value: Company, args: Company.clients[] = null): any {
//         return Object.keys(value)//.map(key => value[key]);
//     }
// }
