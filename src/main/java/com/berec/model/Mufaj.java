package com.berec.model;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mufajok")
public class Mufaj {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "Megnevezes") private String megnevezes;
	
	@OneToMany(mappedBy = "mufaj", cascade = CascadeType.ALL)
    private Set<Film> movies;
	
	public Mufaj(String megnevezes, Film movies) {
		this.megnevezes = megnevezes;
		this.movies = Stream.of(movies).collect(Collectors.toSet());
		this.movies.forEach(x -> x.setMufaj(this));
	}
	
	public Mufaj() {}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getMegnevezes() {
		return megnevezes;
	}
	public void setMegnevezes(String megnevezes) {
		this.megnevezes = megnevezes;
	}

}
