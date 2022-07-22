package com.ams.gestione_dipendenti_be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.gestione_dipendenti_be.model.Sessi;
import com.ams.gestione_dipendenti_be.repository.SessiRepository;
import com.ams.gestione_dipendenti_be.services.interfaces.ISessiService;

@Service
public class SessiService implements ISessiService {
	
	@Autowired
	SessiRepository sRepository;

	@Override
	public Iterable<Sessi> sessiAll() {
		return sRepository.findAll();
		
	}

}
