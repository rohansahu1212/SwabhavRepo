import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmployeeComponent } from './employee/employee.component';
import { SankePipePipe } from './sanke-pipe.pipe';
import { HighlightDirective } from './highlight.directive';



@NgModule({
  declarations: [
    EmployeeComponent,
    SankePipePipe,
    HighlightDirective
  ],
  imports: [
    CommonModule,
  ],
  exports: [EmployeeComponent]
})
export class MonoceptModule { }
