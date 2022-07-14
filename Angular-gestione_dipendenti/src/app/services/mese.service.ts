import { Injectable } from '@angular/core';
import { FormArray, FormGroup } from '@angular/forms';
import { RecordGiorno } from '../models/recordGiorno.model';

@Injectable({
  providedIn: 'root'
})
export class MeseService {

  private settimana=new Map <number,string>([
    [1,"Lun"],
    [2,"Mar"],
    [3,"Mer"],
    [4,"Gio"],
    [5,"Ven"],
    [6,"Sab"],
    [7,"Dom"],
  ])

  private getGiorni(anno:number,mese:number,giorniMese:number): Array<RecordGiorno>{

    let vet=new Array<RecordGiorno>()
    for(let i=1;i<=giorniMese;i++){
      vet.push({
        giorno:i,
        giornoSettimana:this.settimana.get( (new Date(anno,mese,i-1).getDay())+1),
        straordinario:null,
        cliente:"string",
        ore_Servizio:null,
        ore_Compensate:null,
        ore_retribuite:null,
        ore_Nn_Retribuite:null,
        ore_Ferie:null,
        ore_Mutua:null,
        festivo:null
      })
  }
    return vet
  }

  inFormArray(anno:number,mese:number,giorniMese:number):FormArray{

    const formi=new Array<FormGroup>()

    this.getGiorni(anno,mese,giorniMese).forEach(element=>
      formi.push(RecordGiorno.asFormGroup(element))
    )
    return new FormArray(formi)
  }

}
