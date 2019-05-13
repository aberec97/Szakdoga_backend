package com.berec.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "vetites")
public class Vetites {
	
	public Vetites() {
	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer ID;
	
	@ManyToOne
	@JoinColumn(name = "Film") private Film film;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name = "Idopont") private Timestamp idopont;
	@Column(name = "Nyelv") private String nyelv;
	@Column(name = "Tipus") private String tipus;
	
	@ManyToOne
	@JoinColumn(name = "Terem") private Terem terem;
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Timestamp getIdopont() {
		return idopont;
	}
	public void setIdopont(Timestamp idopont) {
		this.idopont = idopont;
	}
	public String getNyelv() {
		return nyelv;
	}
	public void setNyelv(String nyelv) {
		this.nyelv = nyelv;
	}
	public String getTipus() {
		return tipus;
	}
	public void setTipus(String tipus) {
		this.tipus = tipus;
	}
	public Terem getTerem() {
		return terem;
	}
	public void setTerem(Terem terem) {
		this.terem = terem;
	}

	
}
