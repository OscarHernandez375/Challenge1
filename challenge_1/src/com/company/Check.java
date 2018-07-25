package com.company;

public class Check extends PaymentMethod {
    private int number;
    private  int bankid;
    private String holder;

    public void authorize(){
        System.out.println("Check Authorized");
    }

    public Check(int number, int bankid, String holder) {
        this.number = number;
        this.bankid = bankid;
        this.holder = holder;
    }

    //Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setBankid(int bankid) {
        this.bankid = bankid;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    //Getters

    public int getNumber() {
        return number;
    }

    public int getBankid() {
        return bankid;
    }

    public String getHolder() {
        return holder;
    }
}
