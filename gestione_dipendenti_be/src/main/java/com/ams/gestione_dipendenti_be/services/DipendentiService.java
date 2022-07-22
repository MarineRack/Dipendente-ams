package com.ams.gestione_dipendenti_be.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;
import com.ams.gestione_dipendenti_be.repository.Anag_dipendentiRepository;
import com.ams.gestione_dipendenti_be.repository.Rilevazione_o_meseRepository;
import com.ams.gestione_dipendenti_be.services.interfaces.IDipendentiService;

@Service
public class DipendentiService implements IDipendentiService {
	
	@Autowired
	Anag_dipendentiRepository adRepository;
	
	public Anag_dipendenti addDip(Anag_dipendenti dip) {
		return adRepository.save(dip);
	}
	
	public List<Anag_dipendenti> list() {
		return (List<Anag_dipendenti>) adRepository.findAll();
	}

	@Override
	public Anag_dipendenti dipendente(Integer idDip) {
		return adRepository.findById(idDip).get();
	}
	
	
}
