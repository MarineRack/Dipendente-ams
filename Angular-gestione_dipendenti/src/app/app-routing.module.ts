import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AmministratoreComponent } from './amministratore/amministratore.component';
import { LoginComponent } from './login/login.component';
import { RilevazioneOreComponent } from './rilevazione-ore/rilevazione-ore.component';

const routes: Routes = [
  {path: 'login',component:LoginComponent},
  {path: 'admin',component:AmministratoreComponent},
  {path: 'oreMese',component:RilevazioneOreComponent},
  {path: '',redirectTo: '/oreMese', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
