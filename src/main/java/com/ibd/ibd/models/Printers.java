package com.ibd.ibd.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import net.bytebuddy.asm.Advice.Local;

@Entity
public class Printers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprinters;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idlocalization", referencedColumnName = "idlocalization")
    private Localization localization;


    private String owner;
    private String type;
   
    public Printers() {
    }

    public Printers(long idprinters,Localization idlocalization,String owner,String type) {
        this.idprinters = idprinters;
        this.localization = idlocalization;
        this.owner = owner;
        this.type = type;
    }

    public long getID() {
        return idprinters;
    }
    public Localization getLocalization() {
        return localization;
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
    public void setLocalization(Localization s) {
         this.localization = s;
    }
    public void setOwner(String s) {
        this.owner = s;
    }
    public void setType(String s) {
        this.type = s;
    }
}
