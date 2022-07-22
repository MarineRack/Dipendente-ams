package com.ams.gestione_dipendenti_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.gestione_dipendenti_be.model.AnnoMese;
import com.ams.gestione_dipendenti_be.model.Mesi;
import com.ams.gestione_dipendenti_be.services.AnniService;
import com.ams.gestione_dipendenti_be.services.MesiService;

@Controller
@RequestMapping("/mesi")
public class MesiController {

	@Autowired
	MesiService mService;
	@Autowired
	AnniService aService;
	
	@GetMapping(path="/") 
	public @ResponseBody Iterable<Mesi> sessi () {
		return mService.mesiAll();
	}
	
	@GetMapping(path="/mese")
	public @ResponseBody AnnoMese meseAtt () {
		return new AnnoMese(aService.anno(),mService.mese());
	}
}
