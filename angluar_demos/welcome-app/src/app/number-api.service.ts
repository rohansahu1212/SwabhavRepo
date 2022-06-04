import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IFact } from './Ifact';

@Injectable({
  providedIn: 'root',
})
export class NumberApiService {
  constructor(private httpClient: HttpClient) {}

  getFact(number: string): Observable<IFact> {
    let url: string = `http://numberapi.com/${number}/?json`;
    
    return this.httpClient.get<IFact>(url);
  }
}
