package com.company;

import java.util.Date;

 public class CreditCard extends PaymentMethod {
    private double number;
    private Date expDate;
    private int maxinstallements;
    private Issuer issuer;


    public void authorize(){
        System.out.println("Credit card Authorized");
    }

    public CreditCard(double number, Date expDate, int maxinstallements, Issuer issuer) {
        this.number = number;
        this.expDate = expDate;
        this.maxinstallements = maxinstallements;
        this.issuer = issuer;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public void setMaxinstallements(int maxinstallements) {
        this.maxinstallements = maxinstallements;
    }

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }


}
