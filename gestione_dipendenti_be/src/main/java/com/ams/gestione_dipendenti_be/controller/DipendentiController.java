package com.ams.gestione_dipendenti_be.controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;
import com.ams.gestione_dipendenti_be.services.DipendentiService;

@Controller
@RequestMapping("/dipendenti")
public class DipendentiController {
	@Autowired
	DipendentiService dService;
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},path="/add") 
	public @ResponseBody Anag_dipendenti addDipendente(@RequestBody Anag_dipendenti dipendente) {
		dipendente.setPassword("AmsAcc_"+dipendente.getNome().replace(" ", "_"));
		dipendente.setInizioServizio(LocalDate.now());
		return dService.addDip(dipendente);
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<Anag_dipendenti> dipendentiList() {
		List<Anag_dipendenti>dipendenti= dService.list();
		for (Anag_dipendenti i : dipendenti) {
			if(i.getEmail().contains("admin")) {
				dipendenti.remove(i);
				return dipendenti;
			}
		}
		return dipendenti;
	}
	
} 
