import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminClientiComponent } from './amministratore/admin-clienti/admin-clienti.component';
import { AdminDipendentiComponent } from './amministratore/admin-dipendenti/admin-dipendenti.component';
import { AmministratoreComponent } from './amministratore/amministratore.component';
import { LoginComponent } from './login/login.component';
import { RilevazioneOreComponent } from './rilevazione-ore/rilevazione-ore.component';

const routes: Routes = [
  {path: 'login',component:LoginComponent},
  {path: 'admin',component:AmministratoreComponent},
  {path: 'oreMese',component:RilevazioneOreComponent},
  {path: 'clienti',component:AdminClientiComponent},
  {path: 'dipendenti',component:AdminDipendentiComponent},
  {path: '',redirectTo: '/oreMese', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
