package com.ams.gestione_dipendenti_be.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

@Table(name = "anag_giorno_schede_mesi")
public class Anag_giorno_schede_mesi {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@JsonProperty("id")
	private Integer idRecord;
	
	private Integer giorno;
	private Integer ore_servizio;
	private Integer ore_straordinario;
	private Integer ore_compensate;
	private Integer ore_retribuite;
	private Integer ore_ferie;
	private Integer ore_mutua;
	private Integer ferie;
	private Boolean festa;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="id_cliente_cui_lavora")
	@JsonProperty("lavoro")
	Anag_dipendenti_on_clienti anag_dipendenti_on_clienti;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="id_rilevazione_mese")
	@JsonProperty("rilevazione_mese")
	Rilevazione_ore_mese rilevazione_ore_mese;

	public Integer getIdRecord() {
		return idRecord;
	}
	public void setIdRecord(Integer idRecord) {
		this.idRecord = idRecord;
	}
	public Integer getOre_servizio() {
		return ore_servizio;
	}
	public void setOre_servizio(Integer ore_servizio) {
		this.ore_servizio = ore_servizio;
	}
	
	public Integer getOre_mutua() {
		return ore_mutua;
	}
	public void setOre_mutua(Integer ore_mutua) {
		this.ore_mutua = ore_mutua;
	}
	public Integer getOre_ferie() {
		return ore_ferie;
	}
	public void setOre_ferie(Integer ore_ferie) {
		this.ore_ferie = ore_ferie;
	}
	public Integer getOre_retribuite() {
		return ore_retribuite;
	}
	public void setOre_retribuite(Integer ore_retribuite) {
		this.ore_retribuite = ore_retribuite;
	}
	public Integer getOre_compensate() {
		return ore_compensate;
	}
	public void setOre_compensate(Integer ore_compensate) {
		this.ore_compensate = ore_compensate;
	}
	public Integer getOre_straordinario() {
		return ore_straordinario;
	}
	public void setOre_straordinario(Integer ore_straordinario) {
		this.ore_straordinario = ore_straordinario;
	}
	public Integer getGiorno() {
		return giorno;
	}
	public void setGiorno(Integer giorno) {
		this.giorno = giorno;
	}
	public Integer getFerie() {
		return ferie;
	}
	public void setFerie(Integer ferie) {
		this.ferie = ferie;
	}
	public Boolean getFesta() {
		return festa;
	}
	public void setFesta(Boolean festa) {
		this.festa = festa;
	}
	
	
	
}
