package com.ams.gestione_dipendenti_be.services.interfaces;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;
import com.ams.gestione_dipendenti_be.model.Rilevazione_ore_mese;

public interface IRilevazione_ore_meseService {
	void nuovoAnno(Anag_dipendenti dipendente);
	Rilevazione_ore_mese controlloAnno(Integer dipendente);
}
