import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';



@Injectable({
  providedIn: 'root'
})
export class AutenticazioneService {
  

  constructor(private http:HttpClient) { 
    
  }
}
