package com.ams.gestione_dipendenti_be.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ams.gestione_dipendenti_be.model.Anag_dipendenti;

public interface Anag_dipendentiRepository extends CrudRepository<Anag_dipendenti, Integer> {
	@Query("SELECT * FROM Anag_dipendenti WHERE Email= :email")
	Optional<Anag_dipendenti> findByEmail(@Param("email") String email);
}
