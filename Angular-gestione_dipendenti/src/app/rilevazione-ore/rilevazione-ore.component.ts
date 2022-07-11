import { Component} from '@angular/core';

@Component({
  selector: 'app-rilevazione-ore',
  templateUrl: './rilevazione-ore.component.html',
  styleUrls: ['./rilevazione-ore.component.css']
})
export class RilevazioneOreComponent{
  dataOggi:Date=new Date()
  anno:number=new Date().getFullYear()
  mese:number=new Date().getMonth()+1
  giorniMese:number=new Date(this.anno,this.mese,0).getDate()

  displayedColumns: string[] = ['Giorno', 'Cliente', 'Ore','Straordinario', 'Ferie', 'Malattia', 'Ore Permesso Retr', 'Ore Permesso NR'];

}
