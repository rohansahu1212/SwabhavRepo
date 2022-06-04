import { Component } from '@angular/core';
import { AppSettingService } from './app-setting.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  
  title = 'acmeShoping';
  constructor(private appSettingsService: AppSettingService) {}

  ngOnInit() {
    this.appSettingsService.getJSON().subscribe((data) => {
      console.log(data);
    });
  }
}
