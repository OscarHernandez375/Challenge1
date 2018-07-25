package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
		LineItem lineitem = new LineItem(3,2000,new Product(123,"Chicharron","Awsome"));
    	ShoppingCart cart= new ShoppingCart();
    	cart.addItem(lineitem);

	  	Account  account1=new Account( 123564, new Customer(1,"Oscar",123,"Osqui","12345"),AccountStatus.ACTIVE,cart);
	  	account1.addAddress( new Address( 1,"street2","house21","Bogotá","Colombia",true));
	  	account1.addAddress( new Address( 1,"street1","house21","Bogotá","Colombia",true));
	  	account1.addMethod( new CreditCard( 123.123,new Date(10,10,10),1234,Issuer.MASTERCARD));
		System.out.println(account1.getAddresses());

		Order order = new Order(147,OrderStatus.SHIPPPED,"Mi casa");
		order.addItem(lineitem);
		System.out.println(order.setTotal());

    }




}
