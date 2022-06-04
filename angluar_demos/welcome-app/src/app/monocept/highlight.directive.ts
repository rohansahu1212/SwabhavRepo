import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  constructor(public value:ElementRef) {
    this.value.nativeElement.style.backgroundColor="orange";
   }

}
