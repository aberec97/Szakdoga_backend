package com.berec.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "vetites")
public class Vetites implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ID;
    private Film Film;

    @Column(name = "Idopont")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp Idopont;

    private String Nyelv;
    private String Tipus;
    private Terem terem;

    public Vetites() {}

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Film")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    public Film getFilm() {
        return Film;
    }

    public void setFilm(Film film) {
        Film = film;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Timestamp getIdopont() {
        return Idopont;
    }

    public void setIdopont(Timestamp idopont) {
        Idopont = idopont;
    }

    public String getNyelv() {
        return Nyelv;
    }

    public void setNyelv(String nyelv) {
        Nyelv = nyelv;
    }

    public String getTipus() {
        return Tipus;
    }

    public void setTipus(String tipus) {
        Tipus = tipus;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Terem")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    public Terem getTerem() {
        return terem;
    }

    public void setTerem(Terem terem) {
        this.terem = terem;
    }
    
}