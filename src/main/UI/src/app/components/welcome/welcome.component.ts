import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import {WelcomeService} from "../../services/welcome.service";

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  welcomeObject:any;

  constructor(private service: WelcomeService) { }

  ngOnInit(): void {
    this.welcomeObject = this.service.getWelcomeObject().subscribe(data => this.welcomeObject = data);
    // let response = this.http.get("http://localhost:8080/welcome");
    // response.subscribe((data) => this.welcomeObject = data);
  }

}
