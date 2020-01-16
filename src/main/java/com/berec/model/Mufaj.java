package com.berec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mufajok")
public class Mufaj implements Serializable{
    
    private static final long serialVersionUID = 1698803186608488430L;

    public Mufaj (){}

    @Column(name = "ID")
    private Integer ID;
    @Column(name="Megnevezes")
    private String Megnevezes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getMegnevezes() {
        return Megnevezes;
    }

    public void setMegnevezes(String megnevezes) {
        Megnevezes = megnevezes;
    }

    public Mufaj(Integer iD, String megnevezes) {
        ID = iD;
        Megnevezes = megnevezes;
    }

}