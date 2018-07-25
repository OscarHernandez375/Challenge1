package com.company;

public class Address {

    private int id;
    private String lineOne;
    private String lineTwo;
    private String city;
    private String country;
    private boolean billingAddress;

    public Address(int id, String lineOne, String lineTwo, String city, String country, boolean billingAddress) {
        this.id = id;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.city = city;
        this.country = country;
        this.billingAddress = billingAddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBillingAddress(boolean billingAddress) {
        this.billingAddress = billingAddress;
    }

    public int getId() {
        return id;
    }

    public String getLineOne() {
        return lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public boolean isBillingAddress() {
        return billingAddress;
    }

    public String getAddress(){

        return (this.lineOne+" "+this.lineTwo+", "+this.city+"("+this.country+").");
    }
}
