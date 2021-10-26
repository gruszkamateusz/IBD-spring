package com.ibd.ibd.dto;

public class PrintersData {
    private int idprinters;
    private String localization;
    private String owner;
    private String type;

    public PrintersData() {
        this.idprinters = idprinters;
        this.localization = localization;
        this.owner = owner;
        this.type = type;
    }
    public int getID() {
        return idprinters;
    }
    public String getLocalization() {
        return localization;
    }
    public String getOwner() {
        return owner;
    }
    public String getType() {
        return type;
    }
    public void setID(int s) {
        this.idprinters = s;
    }
    public void setLocalization(String s) {
         this.localization = s;
    }
    public void setOwner(String s) {
        this.owner = s;
    }
    public void setType(String s) {
        this.type = s;
    }

}
