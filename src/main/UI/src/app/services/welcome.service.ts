import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class WelcomeService {

  private baseURL = 'http://localhost:8080/welcome'

  constructor(private http: HttpClient) { }

  getWelcomeObject() {
    return this.http.get("http://localhost:8080/welcome");
  }
}
