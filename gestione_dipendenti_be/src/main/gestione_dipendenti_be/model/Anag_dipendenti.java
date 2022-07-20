package com.ams.gestione_dipendenti_be.model;


import java.time.LocalDate;
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

import com.fasterxml.jackson.annotation.JsonFormat;
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
	private String password;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private LocalDate dataNascita;
	
	@OneToMany(mappedBy = "anag_dipendenti",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Anag_dipendenti_on_clienti> anag_dipendenti_on_clienti= new HashSet<>();
	
	@OneToMany(mappedBy = "anag_dipendenti",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Rilevazione_ore_mese> rilevazione_ore_mese= new HashSet<>();
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="id_sesso")
	@JsonProperty("sesso")
	Sessi sessi;
	
	public Anag_dipendenti() {}
	
	public Anag_dipendenti(Integer idDipendente,String email,String password) {
		this.idDipendente=idDipendente;
		this.email=email;
		this.password=password;
		this.nome="admin";
		this.cognome="ams";
		this.dataNascita= LocalDate.now();
	}
	
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

	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
