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

@Table(name = "rilevazione_ore_mese")
public class Rilevazione_ore_mese {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@JsonProperty("id")
	private Integer idOreMese;
	
	private short compilato;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="id_dipendente")
	@JsonProperty("dipendente")
	Anag_dipendenti anag_dipendenti;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="id_mese")
	@JsonProperty("mese")
	Mesi mesi;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="anno")
	@JsonProperty("anno")
	Anni anni;
	
	@OneToMany(mappedBy = "rilevazione_ore_mese",fetch =FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Anag_giorno_schede_mesi> anag_giorno_schede_mesi= new HashSet<>();
	
	public Rilevazione_ore_mese() {}
	
	public Rilevazione_ore_mese(Anag_dipendenti anag_dipendenti,Anni anni,Mesi mesi) {
		this.anag_dipendenti=anag_dipendenti;
		this.anni=anni;
		this.mesi=mesi;
		this.compilato=0;
	}
	
	public Integer getIdOreMese() {
		return idOreMese;
	}
	public void setIdOreMese(Integer idOreMese) {
		this.idOreMese = idOreMese;
	}
	public short getCompilato() {
		return compilato;
	}
	public void setCompilato(short compilato) {
		this.compilato = compilato;
	}
}
