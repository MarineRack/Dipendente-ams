package com.ams.gestione_dipendenti_be.runnerbeans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ams.gestione_dipendenti_be.model.Sessi;
import com.ams.gestione_dipendenti_be.repository.SessiRepository;


@Component
public class SessiRunnerBean {
	
	@Autowired
	SessiRepository sRepository;
	
	@PostConstruct
	public void initSessi()  throws Exception{
		
		if(sRepository.count()==0) {
			sRepository.save(new Sessi(1,"Uomo"));
			sRepository.save(new Sessi(2,"Donna"));
		}
	}

}
