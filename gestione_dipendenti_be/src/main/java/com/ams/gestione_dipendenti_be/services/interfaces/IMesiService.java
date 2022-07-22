package com.ams.gestione_dipendenti_be.services.interfaces;

import com.ams.gestione_dipendenti_be.model.Mesi;

public interface IMesiService {
	Iterable<Mesi> mesiAll();
	Mesi mese();
}
