package com.ams.gestione_dipendenti_be.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;
import com.ams.gestione_dipendenti_be.model.Mesi;
import com.ams.gestione_dipendenti_be.model.Rilevazione_ore_mese;
import com.ams.gestione_dipendenti_be.repository.Rilevazione_o_meseRepository;
import com.ams.gestione_dipendenti_be.services.interfaces.IRilevazione_ore_meseService;

@Service
public class Rilevazione_ore_meseService implements IRilevazione_ore_meseService {

	@Autowired
	Rilevazione_o_meseRepository romRepository;
	@Autowired
	MesiService mService;
	@Autowired
	AnniService aService;
	@Autowired
	DipendentiService dpService;
	
	@Override
	public void nuovoAnno(Anag_dipendenti dipendente) {
				
		for (Mesi mese : mService.mesiAll()) {
			romRepository.save(new Rilevazione_ore_mese(dipendente,aService.anno(),mese));
		}
	}

	@Override
	public Rilevazione_ore_mese controlloAnno(Integer idDip) {
		
		
		System.out.println(dpService.dipendente(idDip).getNome());
		Optional<Rilevazione_ore_mese> annataDip;
		
		return null;
	}
	
	
}
