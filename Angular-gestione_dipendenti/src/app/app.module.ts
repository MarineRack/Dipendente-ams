import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RilevazioneOreComponent } from './rilevazione-ore/rilevazione-ore.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatNativeDateModule } from '@angular/material/core';
import {MatTableModule} from '@angular/material/table';
import {MatToolbarModule} from '@angular/material/toolbar';
import { ReactiveFormsModule } from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field'; 
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select'; 
import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';
import { LoginComponent } from './login/login.component';
import { AmministratoreComponent } from './amministratore/amministratore.component';
import {MatIconModule} from '@angular/material/icon';
import {MatRippleModule} from '@angular/material/core';
@NgModule({
  declarations: [
    AppComponent,
    RilevazioneOreComponent,
    LoginComponent,
    AmministratoreComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatNativeDateModule,
    MatTableModule,
    MatToolbarModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatRippleModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
