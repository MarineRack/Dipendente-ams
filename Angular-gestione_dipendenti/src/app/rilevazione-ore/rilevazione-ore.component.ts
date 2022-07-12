import { Component} from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { giorno } from '../interfaces/giorno';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-rilevazione-ore',
  templateUrl: './rilevazione-ore.component.html',
  styleUrls: ['./rilevazione-ore.component.css']
})
export class RilevazioneOreComponent{


  formGiorno:FormGroup

  oreGiorno = new MatTableDataSource<giorno>()

  dataOggi:Date=new Date()
  anno:number=this.dataOggi.getFullYear()
  mese:number=this.dataOggi.getMonth()+1
  giorniMese:number=new Date(this.anno,this.mese,0).getDate()

  displayedColumns: string[] = ['Giorno', 'Cliente', 'Ore','Straordinario', 'Ore Compensate', 'Ore Permesso Retr', 'Ore Permesso NR','Ferie','Mutua','Festivo'];

  constructor(private fb:FormBuilder){


    this.formGiorno=this.fb.group({
      cliente:["Azienda 1"],
      ore:[],
      ore_straordinario:[],
      ore_compensate:[],
      oreP_retribuite:[],
      oreP_nonRetribuite:[],      
      ore_ferie:[],
      ore_mutua:[],
      festivo:[false]
    })
    
    
    for(let i=1;i<=this.giorniMese;i++){
      const weekDay=new Date(this.anno,this.mese-1,i-1).getDay()

      this.oreGiorno.data.push(
        {
          giorno:i,
          giornoS:weekDay,
          cliente:"",
          ore_Servizio:0,
          straordinario:0,
          ore_Compensate:0,
          ore_Permesso:{
              retribuite:0,
              Nn_Retribuite:0,
          },
          ore_Ferie:0,
          ore_Mutua:0,
          festivo:false
        }
      )
    }
    //console.log(JSON.stringify(this.oreGiorno.data,null,4))
  }

  

}
