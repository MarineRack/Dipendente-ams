package com.ams.gestione_dipendenti_be.model;

import java.util.Date;
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

@Table(name = "anag_dipendenti")
public class Anag_dipendenti {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@JsonProperty("id")
	private Integer idDipendente;
	private String nome;
	private String cognome;
	private String email;
	private Date dataNascita;
	
	@OneToMany(mappedBy = "anag_dipendenti",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Anag_dipendenti_on_clienti> anag_dipendenti_on_clienti= new HashSet<>();
	
	@OneToMany(mappedBy = "anag_dipendenti",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Rilevazione_ore_mese> rilevazione_ore_mese= new HashSet<>();
	
	public Integer getIdDipendente() {
		return idDipendente;
	}
	
	public void setIdDipendente(Integer idDipendente) {
		this.idDipendente = idDipendente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
}
