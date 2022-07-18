import { Component} from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { FormArray, FormBuilder, FormGroup} from '@angular/forms';
import { MeseService } from '../services/mese.service';

@Component({
  selector: 'app-rilevazione-ore',
  templateUrl: './rilevazione-ore.component.html',
  styleUrls: ['./rilevazione-ore.component.css']
})
export class RilevazioneOreComponent{

  formMese: FormGroup;

  dataSource:MatTableDataSource<any>

  dataOggi:Date=new Date()
  anno:number=this.dataOggi.getFullYear()
  mese:number=this.dataOggi.getMonth()+1
  giorniMese:number=new Date(this.anno,this.mese,0).getDate()

  displayedColumns: string[] = ['Giorno', 'Cliente', 'Ore','Straordinario', 'Ore Compensate', 'Ore Permesso Retr', 'Ore Permesso NR','Ferie','Mutua','Festivo'];

  constructor(private fb:FormBuilder,private meseServ:MeseService){

    this.formMese = this.fb.group({
      giorni: this.fb.array([]),
    });

      this.formMese.setControl('giorni',meseServ.inFormArray(this.anno,this.mese-1,this.giorniMese))

      this.dataSource=new MatTableDataSource( (this.formMese.get('giorni')as FormArray).controls )
      
  }

}
