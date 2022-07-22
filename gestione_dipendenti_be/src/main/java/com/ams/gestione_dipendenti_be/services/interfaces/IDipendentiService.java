package com.ams.gestione_dipendenti_be.services.interfaces;

import java.util.List;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;

public interface IDipendentiService {
	Anag_dipendenti addDip(Anag_dipendenti dip);
	List<Anag_dipendenti> list();
	Anag_dipendenti dipendente(Integer idDip);
}
