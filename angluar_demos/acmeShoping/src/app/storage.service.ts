import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StorageService {
  public scope: any;

  constructor() {
  }

  public getScope(): any | boolean {
      return this.scope;
  }

  public setScope(scope: any): void {
      this.scope = scope;
      console.log("service get data"+ this.scope)
  }
}
