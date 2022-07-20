package com.ams.gestione_dipendenti_be.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

@Table(name = "anag_dipendenti_on_clienti")
public class Anag_dipendenti_on_clienti {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@JsonProperty("id")
	private Integer idDipSuClient;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="id_cliente")
	@JsonProperty("cliente")
	Anag_clienti anag_clienti;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="id_dipendente")
	@JsonProperty("dipendente")
	Anag_clienti anag_dipendenti;
	
	@OneToMany(mappedBy = "anag_dipendenti_on_clienti",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Anag_giorno_schede_mesi> anag_giorno_schede_mesi= new HashSet<>();
	
	
	public Integer getIdDipSuClient() {
		return idDipSuClient;
	}
	
	public void setIdDipSuClient(Integer idDipSuClient) {
		this.idDipSuClient = idDipSuClient;
	}
}
