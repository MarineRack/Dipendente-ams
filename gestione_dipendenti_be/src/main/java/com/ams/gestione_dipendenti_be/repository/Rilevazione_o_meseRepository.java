package com.ams.gestione_dipendenti_be.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.gestione_dipendenti_be.model.Rilevazione_ore_mese;

public interface Rilevazione_o_meseRepository extends JpaRepository<Rilevazione_ore_mese, Integer> {
	@SuppressWarnings("unchecked")
	@Override
	Rilevazione_ore_mese save(Rilevazione_ore_mese r);
	
}
