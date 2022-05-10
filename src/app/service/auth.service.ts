import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Investimento } from '../model/Investimento';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(
    private http: HttpClient
  ) { }

  investir(Investimento: Investimento): Observable<Investimento>{
    return this.http.post<Investimento>('http://localhost:8080/investimento', Investimento)
  }

  
}
