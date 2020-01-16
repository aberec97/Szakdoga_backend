package com.berec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "filmek")
public class Film implements Serializable {

    private static final long serialVersionUID = 4169600645056223306L;

    private Integer ID;
    private String Cim;
    private String Szereplok;
    private Integer Jatekido;

    private Mufaj Mufaj;

    private String Tartalom;
    private Integer Ev;
    private String Kep;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getCim() {
        return Cim;
    }

    public void setCim(String cim) {
        Cim = cim;
    }

    public String getSzereplok() {
        return Szereplok;
    }

    public void setSzereplok(String szereplok) {
        Szereplok = szereplok;
    }

    public Integer getJatekido() {
        return Jatekido;
    }

    public void setJatekido(Integer jatekido) {
        Jatekido = jatekido;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Mufaj")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    public Mufaj getMufaj() {
        return Mufaj;
    }

    public void setMufaj(Mufaj mufaj) {
        Mufaj = mufaj;
    }

    public String getTartalom() {
        return Tartalom;
    }

    public void setTartalom(String tartalom) {
        Tartalom = tartalom;
    }

    public Integer getEv() {
        return Ev;
    }

    public void setEv(Integer ev) {
        Ev = ev;
    }

    public String getKep() {
        return Kep;
    }

    public void setKep(String kep) {
        Kep = kep;
    }

    public Film() {}

    public Film(Integer iD, String cim, String szereplok, Integer jatekido,
            Mufaj mufaj, String tartalom, Integer ev, String kep) {
        ID = iD;
        Cim = cim;
        Szereplok = szereplok;
        Jatekido = jatekido;
        Mufaj = mufaj;
        Tartalom = tartalom;
        Ev = ev;
        Kep = kep;
    }

}