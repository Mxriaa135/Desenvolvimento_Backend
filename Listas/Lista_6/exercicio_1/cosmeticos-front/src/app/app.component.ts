import { Component } from '@angular/core';
import { Cosmetico } from './models/cosmetico';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'cosmeticos-front';

  cosmeticos!: Cosmetico[]

  constructor(private httpClient: HttpClient) {}

  ngOnInit(): void {
    this.getCosmeticos();
  }
      
  getCosmeticos(){
    this.httpClient.get<Cosmetico[]>('http://localhost:8080/cosmeticos').subscribe(resposta => {
      this.cosmeticos = resposta;
    })
  }
}
