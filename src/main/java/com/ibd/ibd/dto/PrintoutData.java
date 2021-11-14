package com.ibd.ibd.dto;

import java.time.LocalDateTime;

import com.ibd.ibd.models.Printers;

public class PrintoutData {
    private long idprintouts;
    private Printers printer;
    private String title;
    private LocalDateTime date;

    public PrintoutData() {
        this.idprintouts = idprintouts;
        this.printer = printer;
        this.title = title;
        this.date = date;
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
    public void setID(long l) {
        this.idprintouts = l;
    }
    public void setPrinter(Printers l) {
        this.printer = l;
    }
    public void setTitle(String s) {
        this.title = s;
    }
    public void setDate(LocalDateTime s) {
        this.date = s;
    }
}
