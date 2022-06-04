import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomeComponent } from './home.component';
import { ClickCounterComponenetComponent } from './click-counter-componenet/click-counter-componenet.component';
import { WishComponentComponent } from './wish-component/wish-component.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TodoComponentComponent } from './todo-component/todo-component.component';
import { SliderComponentComponent } from './slider-component/slider-component.component';
import { FontAusmComponent } from './font-ausm/font-ausm.component';
import { WelComeComponent } from './wel-come/wel-come.component';
import { NumberApiComponent } from './number-api/number-api.component';
import { StudentComponentComponent } from './student-component/student-component.component';
import { HttpClientModule } from '@angular/common/http';
import { MonoceptModule } from './monocept/monocept.module';
import { SankePipePipe } from './sanke-pipe.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ClickCounterComponenetComponent,
    WishComponentComponent,
    TodoComponentComponent,
    SliderComponentComponent,
    FontAusmComponent,
    WelComeComponent,
    NumberApiComponent,
    StudentComponentComponent,
    SankePipePipe,
  ],
  imports: [BrowserModule, FormsModule,ReactiveFormsModule, HttpClientModule,MonoceptModule],
  providers: [],
  bootstrap: [
   SliderComponentComponent,
  ],
})
export class AppModule {}
