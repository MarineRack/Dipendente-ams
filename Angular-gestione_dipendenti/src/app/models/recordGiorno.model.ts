import { FormControl, FormGroup, Validators } from "@angular/forms"

export class RecordGiorno{
    
    giorno:number | any
    giornoSettimana:string | any
    cliente:string | any
    ore_Servizio:number | any
    straordinario:number | any
    ore_Compensate:number | any
    ore_retribuite:number | any
    ore_Nn_Retribuite:number | any
    ore_Ferie:number | any
    ore_Mutua:number | any
    festivo:number | any

    static asFormGroup(record: RecordGiorno): FormGroup {
        return new FormGroup({
            giorno: new FormControl(record.giorno, Validators.required),
            giornoSettimana: new FormControl(record.giornoSettimana, Validators.required),
            cliente: new FormControl(record.cliente, Validators.required),
            ore_Servizio: new FormControl(record.ore_Servizio, Validators.required),
            ore_Straordinario: new FormControl(record.straordinario, Validators.required),
            ore_Compensate: new FormControl(record.ore_Compensate, Validators.required),
            ore_Retribuite: new FormControl(record.ore_retribuite, Validators.required),
            ore_Nn_Retribuite: new FormControl(record.ore_Nn_Retribuite, Validators.required),
            ore_Ferie: new FormControl(record.ore_Ferie, Validators.required),
            ore_Mutua: new FormControl(record.ore_Mutua, Validators.required),
            festivo: new FormControl(record.festivo, Validators.required),
        });
      }
}