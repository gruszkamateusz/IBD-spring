package com.ibd.ibd.models;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Printouts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprintouts;
    private long idprinters;
    private String title;
    private LocalDateTime date;
   
    public Printouts() {
    }

    public long getID() {
        return idprintouts;
    }
    public long getIDPrinter() {
        return idprinters;
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
    public void setIDPrinter(int s) {
        this.idprinters = s;
    }
    public void setTitle(String s) {
        this.title = s;
    }
    public void setDate(LocalDateTime s) {
        this.date = s;
    }
}
