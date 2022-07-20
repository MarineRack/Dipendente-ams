package com.ams.gestione_dipendenti_be.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;

public interface Anag_dipendentiRepository extends CrudRepository<Anag_dipendenti, Integer> {
	Optional<Anag_dipendenti> findByEmail(String email);
}
