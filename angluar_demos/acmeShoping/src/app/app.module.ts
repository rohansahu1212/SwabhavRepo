import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductDetailsComponent } from './product-list/product-details/product-details.component';
import { HttpClientModule } from '@angular/common/http';
import { StarComponent } from './product-list/star/star.component';
import { FormsModule } from '@angular/forms';
import { MyFilterPipe } from './my-filter.pipe';
//import productData from './products.json';  

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    ProductListComponent,
    ProductDetailsComponent,
    StarComponent,
    MyFilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
 
}
