package com.ams.gestione_dipendenti_be.runnerbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ams.gestione_dipendenti_be.model.Sessi;
import com.ams.gestione_dipendenti_be.repository.SessiRepository;


@Component
public class SessiRunnerBean implements ApplicationRunner{
	
	@Autowired
	SessiRepository sRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		if(sRepository.count()==0) {
			sRepository.save(new Sessi(1,"Uomo"));
			sRepository.save(new Sessi(2,"Donna"));
		}
	}

}
