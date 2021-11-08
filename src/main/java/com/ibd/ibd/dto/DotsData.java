package com.ibd.ibd.dto;

import java.time.LocalDateTime;
public class DotsData {
    private long iddot;
    private long idprinters;
    private String title;
    private LocalDateTime date;

    public DotsData() {
        this.iddot = iddot;
        this.idprinters = idprinters;
        this.title = title;
        this.date = date;
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
    public void setID(long l) {
        this.iddot = l;
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
