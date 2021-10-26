package com.ibd.ibd.dto;

import java.time.LocalDateTime;

public class PrintoutData {
    private int idprintouts;
    private int idprinters;
    private String title;
    private LocalDateTime date;

    public PrintoutData() {
        this.idprintouts = idprintouts;
        this.idprinters = idprinters;
        this.title = title;
        this.date = date;
    }
    public int getID() {
        return idprintouts;
    }
    public int getIDPrinter() {
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
