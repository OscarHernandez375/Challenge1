package com.company;

import java.util.Date;

public class DebitCard extends PaymentMethod{
    private double number;
    private Date expDate;
    private Issuer issuer;


    public void authorize(){
        System.out.println("Debit card Authorized");
    }

    public DebitCard(double number, Date expDate, Issuer issuer) {
        this.number = number;
        this.expDate = expDate;
        this.issuer = issuer;
    }
    //setters
    public void setNumber(double number) {
        this.number = number;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }

    //getters

    public double getNumber() {
        return number;
    }

    public Date getExpDate() {
        return expDate;
    }

    public Issuer getIssuer() {
        return issuer;
    }
}
