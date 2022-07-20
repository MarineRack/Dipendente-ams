package com.ams.gestione_dipendenti_be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;
import com.ams.gestione_dipendenti_be.repository.Anag_dipendentiRepository;
import com.ams.gestione_dipendenti_be.services.interfaces.IDipendentiService;

@Service
public class DipendentiService implements IDipendentiService {
	
	@Autowired
	Anag_dipendentiRepository adRepository;
	
	public Anag_dipendenti addDip(Anag_dipendenti dip) {
		return adRepository.save(dip);
	}
}
