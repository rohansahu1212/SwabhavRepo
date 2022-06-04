import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'snakeMono'
})
export class SankePipePipe implements PipeTransform {
  transform(value:String): String {
    return value.replace(" ","_");
  }
}
