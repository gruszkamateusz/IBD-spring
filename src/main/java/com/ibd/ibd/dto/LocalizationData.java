package com.ibd.ibd.dto;

public class LocalizationData {
    private long idlocalization;
    private String city;
    private String street;
    private String postcode;

    public LocalizationData() {
        this.idlocalization = idlocalization;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
    }

    public long getID() {
        return idlocalization;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setID(long s) {
        this.idlocalization = s;
    }
    public void setCity(String s) {
         this.city = s;
    }
    public void setStreet(String s) {
        this.street = s;
    }
    public void setPostcode(String s) {
        this.postcode = s;
    }
}
