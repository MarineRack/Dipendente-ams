package com.ams.gestione_dipendenti_be.runnerbeans;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;
import com.ams.gestione_dipendenti_be.repository.Anag_dipendentiRepository;

@Component
public class DipendentiRunnerBean{
	
	@Autowired
	Anag_dipendentiRepository dipRepository;
	
	@PostConstruct
	public void runDipendente() throws Exception {	
		
	Optional<Anag_dipendenti> i=dipRepository.findByEmail("admin");
	
	if(i.isEmpty()) {
		dipRepository.save(new Anag_dipendenti(1,"admin","123") );
		}
			
	}

}
