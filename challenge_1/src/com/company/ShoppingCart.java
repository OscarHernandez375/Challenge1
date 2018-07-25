package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static List<LineItem> items = new ArrayList<>();

    public void addItem(LineItem item){ items.add(item); }

    public void cleanCart(){ items.clear();}
}
