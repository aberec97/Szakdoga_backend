package com.berec.model;

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
@Table(name = "foglalas")
public class Foglalas {

    private Integer ID;
    private Integer Hely_sorszama;
    private Integer Igazolvany_szam;
    private Vetites Vetites;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public Integer getHely_sorszama() {
        return Hely_sorszama;
    }

    public void setHely_sorszama(Integer hely_sorszama) {
        Hely_sorszama = hely_sorszama;
    }

    public Integer getIgazolvany_szam() {
        return Igazolvany_szam;
    }

    public void setIgazolvany_szam(Integer igazolvany_szam) {
        Igazolvany_szam = igazolvany_szam;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Vetites")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    public Vetites getVetites() {
        return Vetites;
    }

    public void setVetites(Vetites vetites) {
        Vetites = vetites;
    }

    



}