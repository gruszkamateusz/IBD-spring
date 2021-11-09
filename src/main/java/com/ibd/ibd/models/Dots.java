package com.ibd.ibd.models;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dots {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddot;
    private long idprinters;
    private String title;
    private LocalDateTime date;
   
    public Dots() {
    }

    public long getID() {
        return iddot;
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
        this.iddot = s;
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
