package com.ams.gestione_dipendenti_be.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

@Table(name = "mesi")
public class Mesi {

	@Id
	@Column(name="id")
	@JsonProperty("id")
	private Integer idMese;
	private String nome;
	
	@OneToMany(mappedBy = "mesi",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Rilevazione_ore_mese> rilevazione_ore_mese= new HashSet<>();
	
	public void setIdMese(Integer idMese) {
		this.idMese = idMese;
	}
	public Integer getIdMese() {
		return idMese;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
