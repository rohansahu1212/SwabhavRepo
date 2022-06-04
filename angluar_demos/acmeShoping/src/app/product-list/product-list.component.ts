import { Component, OnInit } from '@angular/core';
import { AppSettingService } from '../app-setting.service';
import { StorageService } from '../storage.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
})
export class ProductListComponent implements OnInit {
  name: String = 'rohan';
  imgShow: String = 'hidden';
  button: String = 'show Image';
  products: any[] = [];
  product: any = [];
  srch: String = '';
  constructor(private appSettingsService: AppSettingService) {
    console.log('hey products');
  }
  ngOnInit() {
    this.appSettingsService.getJSON().subscribe((data) => {
      console.log(data);

      this.products = data;
      console.log(this.product);
    });
  }
  showImages() {
    if (this.imgShow.match('hidden')) {
      this.imgShow = 'visible';
      this.button = 'hide Image';
    }
    else if (this.imgShow.match('visible')) {
      this.imgShow = 'hidden';
      this.button = 'Show Image';
    }
  }
}
