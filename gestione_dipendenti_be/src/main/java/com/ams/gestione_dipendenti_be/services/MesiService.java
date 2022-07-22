package com.ams.gestione_dipendenti_be.services;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.gestione_dipendenti_be.model.Mesi;
import com.ams.gestione_dipendenti_be.repository.MesiRepository;
import com.ams.gestione_dipendenti_be.services.interfaces.IMesiService;

@Service
public class MesiService implements IMesiService {

	@Autowired
	MesiRepository mRepository;
	
	@Override
	public Iterable<Mesi> mesiAll() {
		return mRepository.findAll();
	}

	@Override
	public Mesi mese() {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int month = localDate.getMonthValue();
		return mRepository.findById(month).get();
	}
	

}
