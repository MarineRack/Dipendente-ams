
export interface giorno{
    giorno:number,
    giornoS:number,
    cliente:string,
    ore_Servizio:number,
    straordinario:number,
    ore_Compensate:number,
    ore_Permesso:{
        retribuite:number,
        Nn_Retribuite:number,
    },
    ore_Ferie:number,
    ore_Mutua:number,
    festivo:boolean
}