import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductDetailsComponent } from './product-list/product-details/product-details.component';
import { ProductListComponent } from './product-list/product-list.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [{path:'',component:WelcomeComponent},
                        {path:'product',component:ProductListComponent},
                        {path:'**',component:ProductDetailsComponent}
                      ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
