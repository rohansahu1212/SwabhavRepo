import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'formModule';

  frmLogin= new FormGroup({
    username: new FormControl('',Validators.required),
    userpwd: new FormControl('',Validators.required)
  })
}
