package com.example.products_ms.models;

public class Company {
    private String id;
    private String name;
    private String country;
    private String[] sector;

    public Company(String id, String name, String country, String[] sector) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.sector = sector;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getSector() {
        return sector;
    }

    public void setSector(String[] sector) {
        this.sector = sector;
    }
}
