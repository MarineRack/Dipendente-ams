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

@Table(name = "sessi")
public class Sessi {
	
	@Id
	@Column(name="id")
	@JsonProperty("id")
	private Integer idSesso;
	private String sesso;
	
	@OneToMany(mappedBy = "sessi",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Anag_dipendenti> anag_dipendenti= new HashSet<>();
	
	public Sessi() {}
	
	public Sessi(Integer idSesso,String sesso) {
		this.idSesso=idSesso;
		this.sesso=sesso;
	}
	
	public void setIdSesso(Integer idSesso) {
		this.idSesso = idSesso;
	}
	
	public Integer getIdSesso() {
		return idSesso;
	}
	
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
}
