package com.generics.smartwarehousemanagementsystem;

abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // each item will describe itself
    public abstract String getCategory();

   
    public String toString() {
        return getCategory() + " [Name=" + name + ", Price=" + price + "]";
    }
}
