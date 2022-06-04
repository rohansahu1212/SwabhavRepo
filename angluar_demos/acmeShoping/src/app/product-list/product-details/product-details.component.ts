import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AppSettingService } from 'src/app/app-setting.service';
import { StorageService } from 'src/app/storage.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css'],
})
export class ProductDetailsComponent implements OnInit {
  token: string = '';
  id: number = 0;
  product: any;
  item:any;
  products: any[] = [];
  constructor(
    private route: ActivatedRoute,
    private appSettingsService: AppSettingService
  ) {}

  ngOnInit(): void {
    this.route.queryParams.subscribe((params) => {
      this.product = params;
      console.log(params);
      this.id = this.product.id;
      console.log(' id is ' + this.product.id);
    });

    this.appSettingsService.getJSON().subscribe((data) => {
      console.log(data);

      this.products = data;
      console.log(this.products)
      this.item=this.products[this.id]
      console.log(this.item)
    });
   
  

    
  }
}
