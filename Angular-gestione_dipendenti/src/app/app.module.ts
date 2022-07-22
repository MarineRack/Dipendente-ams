import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RilevazioneOreComponent } from './rilevazione-ore/rilevazione-ore.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatNativeDateModule, MatRippleModule } from '@angular/material/core';
import { MatTableModule} from '@angular/material/table';
import { MatToolbarModule} from '@angular/material/toolbar';
import { ReactiveFormsModule } from '@angular/forms';
import { MatFormFieldModule} from '@angular/material/form-field'; 
import { MatInputModule} from '@angular/material/input';
import { MatSelectModule} from '@angular/material/select'; 
import { MatButtonModule} from '@angular/material/button';
import { MatCardModule} from '@angular/material/card';
import { LoginComponent } from './login/login.component';
import { AmministratoreComponent } from './amministratore/amministratore.component';
import {MatIconModule} from '@angular/material/icon';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatSortModule} from '@angular/material/sort';
import {CalendarioDipendenteComponent} from './amministratore/admin-dipendenti/calendario-dipendente/calendario-dipendente.component'
import { AggiungiClienteComponent } from './amministratore/admin-clienti/aggiungi-cliente/aggiungi-cliente.component';
import { AggiungiDipendenteComponent } from './amministratore/admin-dipendenti/aggiungi-dipendente/aggiungi-dipendente.component';
import { AdminClientiComponent } from './amministratore/admin-clienti/admin-clienti.component';
import { AdminDipendentiComponent } from './amministratore/admin-dipendenti/admin-dipendenti.component';
import { RecuperoPasswordComponent } from './recupero-password/recupero-password.component';
import { PaginaControllaEmailComponent } from './pagina-controlla-email/pagina-controlla-email.component';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import { ModificaDipendenteComponent } from './amministratore/admin-dipendenti/modifica-dipendente/modifica-dipendente.component';
@NgModule({
  declarations: [	
    AppComponent,
    RilevazioneOreComponent,
    LoginComponent,
    AmministratoreComponent,
    AdminClientiComponent,
    AdminDipendentiComponent,
    RecuperoPasswordComponent,
    PaginaControllaEmailComponent,
    AggiungiDipendenteComponent,
    AggiungiClienteComponent,
    ModificaDipendenteComponent,
    CalendarioDipendenteComponent
      
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
    MatRippleModule,
    MatPaginatorModule,
    MatSortModule,
    MatAutocompleteModule
    

  ],
  providers: [
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
