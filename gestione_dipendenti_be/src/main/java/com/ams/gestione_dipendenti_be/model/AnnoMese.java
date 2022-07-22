package com.ams.gestione_dipendenti_be.model;

public class AnnoMese {
	Anni anno;
	Mesi mese;
	
	public AnnoMese(Anni anno , Mesi mese) {
		this.anno=anno;
		this.mese=mese;
	}
	
	public Anni getAnno() {
		return anno;
	}
	public Mesi getMese() {
		return mese;
	}
}
