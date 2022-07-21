package com.ams.gestione_dipendenti_be.runnerbeans;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ams.gestione_dipendenti_be.services.AnniService;

@Component
public class AnniRunnerBean{
	
	@Autowired
	AnniService aService;
	
	@PostConstruct
	public void runAnni()throws Exception {
		aService.anno();
		
	}

}
