package com.ibd.ibd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Printers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprinters;
    private long idlocalization;
    private String owner;
    private String type;
   
    public Printers() {
    }

    public Printers(long idprinters,long idlocalization,String owner,String type) {
        this.idprinters = idprinters;
        this.idlocalization = idlocalization;
        this.owner = owner;
        this.type = type;
    }

    public long getID() {
        return idprinters;
    }
    public long getLocalization() {
        return idlocalization;
    }
    public String getOwner() {
        return owner;
    }
    public String getType() {
        return type;
    }
    public void setID(long s) {
        this.idprinters = s;
    }
    public void setLocalization(long s) {
         this.idlocalization = s;
    }
    public void setOwner(String s) {
        this.owner = s;
    }
    public void setType(String s) {
        this.type = s;
    }
}
