package com.ams.gestione_dipendenti_be.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.gestione_dipendenti_be.model.Sessi;
import com.ams.gestione_dipendenti_be.services.SessiService;

@Controller
@RequestMapping("/sessi")
public class SessiController {

	@Autowired
	SessiService sService;
	
	@GetMapping(path="/") 
	public @ResponseBody Iterable<Sessi> sessi () {
		return sService.sessiAll();
	}
}
