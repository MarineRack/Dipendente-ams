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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

@Table(name = "anag_clienti")
public class Anag_clienti {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@JsonProperty("id")
	private Integer idCliente;
	private String ragioneSociale;
	
	@OneToMany(mappedBy = "anag_clienti",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Anag_dipendenti_on_clienti> anag_dipendenti_on_clienti= new HashSet<>();
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	
}
