import { Injectable } from '@angular/core';
import {environment} from '../../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Pet} from '../data/pet';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PetService {
  private apiUrl = `${environment.apiUrl}/pets`;

  constructor(private http: HttpClient) { }

  getPets():Observable<Pet[]> {
    return this.http.get<Pet[]>(this.apiUrl)
  }

  getPet(id: number):Observable<Pet> {
    return this.http.get<Pet>(this.apiUrl)
  }
}
