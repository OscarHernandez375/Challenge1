package com.company;

public class Product {
    private int sku;
    private String name;
    private String description;

    public Product(int sku, String name, String description) {
        this.sku = sku;
        this.name = name;
        this.description = description;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
