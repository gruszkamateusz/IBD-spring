package com.ibd.ibd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Printers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idprinters;
    private String localization;
    private String owner;
    private String type;
   
    public Printers() {
    }
    public int getID() {
        return idprinters;
    }
    public String getLocalization() {
        return localization;
    }
    public String getOwner() {
        return owner;
    }
    public String getType() {
        return type;
    }
    public void setID(int s) {
        this.idprinters = s;
    }
    public void setLocalization(String s) {
         this.localization = s;
    }
    public void setOwner(String s) {
        this.owner = s;
    }
    public void setType(String s) {
        this.type = s;
    }
}
