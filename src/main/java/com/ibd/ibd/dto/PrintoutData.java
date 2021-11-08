package com.ibd.ibd.dto;

import java.time.LocalDateTime;

public class PrintoutData {
    private long idprintouts;
    private long idprinters;
    private String title;
    private LocalDateTime date;

    public PrintoutData() {
        this.idprintouts = idprintouts;
        this.idprinters = idprinters;
        this.title = title;
        this.date = date;
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
    public void setID(long l) {
        this.idprintouts = l;
    }
    public void setIDPrinter(long l) {
        this.idprinters = l;
    }
    public void setTitle(String s) {
        this.title = s;
    }
    public void setDate(LocalDateTime s) {
        this.date = s;
    }
}
