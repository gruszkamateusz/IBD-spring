package com.ibd.ibd.dto;

import java.util.Optional;

import com.ibd.ibd.models.Localization;

public class PrintersData {
    private long idprinters;
    private Localization localization;
    private String owner;
    private String type;

    public PrintersData() {
        this.idprinters = idprinters;
        this.localization = localization;
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
    public void setID(long l) {
        this.idprinters = l;
    }
    public void setLocalization(Localization localization2) {
         this.localization = localization2;
    }
    public void setOwner(String s) {
        this.owner = s;
    }
    public void setType(String s) {
        this.type = s;
    }

}
