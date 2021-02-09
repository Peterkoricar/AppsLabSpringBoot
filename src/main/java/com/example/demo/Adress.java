package com.example.demo;

import javax.persistence.*;


@Entity
public class Adress {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String street;
    private int zipCode;
    private String state;
    private String city;

    public Adress(String street, int zipCode, String state, String city) {

        this.street = street;
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
