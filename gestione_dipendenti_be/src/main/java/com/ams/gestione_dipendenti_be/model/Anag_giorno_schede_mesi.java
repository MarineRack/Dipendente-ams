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
	
	private Integer oreInteger;
	
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
	
	public Integer getOreInteger() {
		return oreInteger;
	}

	public void setOreInteger(Integer oreInteger) {
		this.oreInteger = oreInteger;
	}
}
