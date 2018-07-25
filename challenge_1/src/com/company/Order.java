package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    private int id_order;
    private Date modified;
    private OrderStatus status;
    private String shippingAddress;
    private double total = 10;
    private List<LineItem> items = new ArrayList<>();

    public void addItem(LineItem item){
        items.add(item);
        total=setTotal();
        //look for info about current Datetime...
        modified= new Date();
        System.out.println(modified);
    }
    public double setTotal(){
        double totalCal=0;
        for (LineItem item: items){
            totalCal += item.getQuantity() * item.getPrice();
        }
        return totalCal;
    }

    public Order(int id_order, OrderStatus status, String shippingAddress) {
        this.id_order = id_order;
        this.status = status;
        this.shippingAddress = shippingAddress;
    }
}
