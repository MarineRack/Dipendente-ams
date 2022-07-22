package com.ams.gestione_dipendenti_be.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.gestione_dipendenti_be.model.Anni;
import com.ams.gestione_dipendenti_be.repository.AnniRepository;
import com.ams.gestione_dipendenti_be.services.interfaces.IAnniService;

@Service
public class AnniService implements IAnniService {
	
	@Autowired
	AnniRepository aRepository;
	
	
	
	public Anni anno() {
		
		Calendar calendar= Calendar.getInstance();
		calendar.setTime(new Date());
		if(aRepository.findById(calendar.get(Calendar.YEAR)).isEmpty()) {
			for (int i = 0; i <= 5; i++) 
				aRepository.save(new Anni(calendar.get(Calendar.YEAR)+i) );
			}
		return new Anni(calendar.get(Calendar.YEAR));
	}
}
