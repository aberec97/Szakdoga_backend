package com.berec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "termek")
public class Terem implements Serializable {

    private static final long serialVersionUID = -5135238911655896903L;
    
    private Integer ID;
    private Integer helyek_szama;

    public Terem(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
