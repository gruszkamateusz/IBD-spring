package com.ibd.ibd.models;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Printouts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprintouts;
    @OneToOne()
    @JoinColumn(name = "idprinters", referencedColumnName = "idprinters")
    private Printers printer;
    private String title;
    private LocalDateTime date;
   
    public Printouts() {
    }

    public long getID() {
        return idprintouts;
    }
    public Printers getPrinter() {
        return printer;
    }
    public String getTitle() {
        return title;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setID(int s) {
        this.idprintouts = s;
    }
    public void setPrinter(Printers s) {
        this.printer = s;
    }
    public void setTitle(String s) {
        this.title = s;
    }
    public void setDate(LocalDateTime s) {
        this.date = s;
    }
}
