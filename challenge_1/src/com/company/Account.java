package com.company;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int id;
    private Customer customer;
    private AccountStatus status;
    private ShoppingCart cart;
    private static List<Address> addresses = new ArrayList<>();
    private static List<PaymentMethod> methods = new ArrayList<>();;

    public Account(int id, Customer customer, AccountStatus status,ShoppingCart cart) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.cart = cart;

    }

    public void addMethod(PaymentMethod method){methods.add(method);}

    public void addAddress(Address address){ addresses.add(address); }

    public void destroyMethods(){ methods.clear(); }

    public void destroyAddresses(){ addresses.clear(); }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public List<PaymentMethod> getMethods() {
        return methods;
    }

}
