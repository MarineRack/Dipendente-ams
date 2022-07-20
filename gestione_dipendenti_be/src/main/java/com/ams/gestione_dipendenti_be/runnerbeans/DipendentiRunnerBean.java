package com.ams.gestione_dipendenti_be.runnerbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;
import com.ams.gestione_dipendenti_be.repository.Anag_dipendentiRepository;

@Component
public class DipendentiRunnerBean implements ApplicationRunner{
	
	@Autowired
	Anag_dipendentiRepository dipRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		if(dipRepository.findByEmail("admin").isEmpty())
			dipRepository.save(new Anag_dipendenti(1,"admin","123") );
		
	}

}
