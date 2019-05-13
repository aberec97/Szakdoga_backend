package com.berec.model;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "termek")
public class Terem {
	
	public Terem() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "helyek_szama")
	private Integer helyek_szama;
	
	@OneToMany
	private Set<Vetites> vetitesek;
	
	public Terem(Integer helyek, Vetites vetitesek) {
		this.helyek_szama = helyek;
		this.vetitesek = Stream.of(vetitesek).collect(Collectors.toSet());
		this.vetitesek.forEach(x -> x.setTerem(this));
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getHelyek_szama() {
		return helyek_szama;
	}

	public void setHelyek_szama(Integer helyek_szama) {
		this.helyek_szama = helyek_szama;
	}

}
