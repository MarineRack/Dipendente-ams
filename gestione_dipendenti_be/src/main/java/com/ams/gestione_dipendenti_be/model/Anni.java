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

@Table(name = "anni")
public class Anni {

	@Id
	@Column(name="anno")
	@JsonProperty("anno")
	private Integer anno;
	
	@OneToMany(mappedBy = "anni",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Rilevazione_ore_mese> rilevazione_ore_mese= new HashSet<>();
	
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	public Integer getAnno() {
		return anno;
	}
	
}
