package com.ams.gestione_dipendenti_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;
import com.ams.gestione_dipendenti_be.services.Rilevazione_ore_meseService;

@Controller
@RequestMapping("/annoOre")
public class Rilevazione_ore_meseController {
	
	@Autowired
	Rilevazione_ore_meseService romService;
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},path="/addDip") 
	public @ResponseBody void annoOreAdd(@RequestBody Anag_dipendenti dipendente) {
		romService.nuovoAnno(dipendente);
	}
	
	
}
