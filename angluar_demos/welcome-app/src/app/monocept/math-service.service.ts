import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MathServiceService {

  constructor() { }


  getRandomEvenNos(value:number):number[]{
    var arr_even_number:number[] = new Array(value)
    
    for(var i = 0;i<arr_even_number.length;i++) { 
      arr_even_number[i] = 2*Math.floor(Math.random() * (10 - 1 + 1)) 
   }
    return arr_even_number;
  }
}
