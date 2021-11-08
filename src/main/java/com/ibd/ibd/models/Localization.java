package com.ibd.ibd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Localization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idlocalization;
    private String city;
    private String street;
    private String postcode;
   
    public Localization() {

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
    public void setID(int s) {
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
