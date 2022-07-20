package com.ams.gestione_dipendenti_be.runnerbeans;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ams.gestione_dipendenti_be.model.Anni;
import com.ams.gestione_dipendenti_be.repository.AnniRepository;

@Component
public class AnniRunnerBean{
	
	@Autowired
	AnniRepository aRepository;
	
	@PostConstruct
	public void runAnni()throws Exception {
		
		Calendar calendar= Calendar.getInstance();
		calendar.setTime(new Date());
		if(aRepository.findById(calendar.get(Calendar.YEAR)).isEmpty()) {
			for (int i = 0; i <= 5; i++) {
				aRepository.save(new Anni(calendar.get(Calendar.YEAR)+i) );
				}
		}
		
	}

}
