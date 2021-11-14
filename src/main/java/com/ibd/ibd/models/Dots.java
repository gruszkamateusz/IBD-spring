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
public class Dots {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddot;
    @OneToOne()
    @JoinColumn(name = "idprinters", referencedColumnName = "idprinters")
    private Printers printer;
    private String title;
    private LocalDateTime date;
   
    public Dots() {
    }

    public long getID() {
        return iddot;
    }
    public Printers getIDPrinter() {
        return printer;
    }
    public String getTitle() {
        return title;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setID(int s) {
        this.iddot = s;
    }
    public void setIDPrinter(Printers s) {
        this.printer = s;
    }
    public void setTitle(String s) {
        this.title = s;
    }
    public void setDate(LocalDateTime s) {
        this.date = s;
    }
}
