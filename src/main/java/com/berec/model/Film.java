package com.berec.model;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "filmek")
public class Film {
	
	public Film() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "Cim") private String cim;
	@Column(name = "Szereplok") private String szereplok;
	@Column(name = "Jatekido") private Integer jatekIdo;
	
	@ManyToOne
	@JoinColumn(name = "Mufaj")
	@JsonIgnore
	private Mufaj mufaj;
	
	@Column(name = "Tartalom") private String tartalom;
	@Column(name = "Ev") private Integer ev;
	@Column(name = "Kep") private String kep;
	
	//@OneToMany
	//@JsonIgnore
	//private Set<Vetites> vetitesek;
	
	public Film(String cim, String szereplok, Integer jatekIdo, Mufaj mufaj, String tartalom, Integer ev, String kep/*, Vetites vetitesek*/) {
		this.cim = cim;
		this.szereplok = szereplok;
		this.jatekIdo = jatekIdo;
		this.mufaj = mufaj;
		this.tartalom = tartalom;
		this.ev = ev;
		this.kep = kep;
		//this.vetitesek = Stream.of(vetitesek).collect(Collectors.toSet());
		//this.vetitesek.forEach(x -> x.setFilm(this));
	}
	
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getCim() {
		return cim;
	}
	public void setCim(String cim) {
		this.cim = cim;
	}
	public String getSzereplok() {
		return szereplok;
	}
	public void setSzereplok(String szereplok) {
		this.szereplok = szereplok;
	}
	public Integer getJatekIdo() {
		return jatekIdo;
	}
	public void setJatekIdo(Integer jatekIdo) {
		this.jatekIdo = jatekIdo;
	}
	
	public Mufaj getMufaj() {
		return mufaj;
	}
	public void setMufaj(Mufaj mufaj) {
		this.mufaj = mufaj;
	}
	public String getTartalom() {
		return tartalom;
	}
	public void setTartalom(String tartalom) {
		this.tartalom = tartalom;
	}
	public Integer getEv() {
		return ev;
	}
	public void setEv(Integer ev) {
		this.ev = ev;
	}
	
	public String getKep() {
		return kep;
	}
	public void setKep (String kep) {
		this.kep = kep;
	}
}
