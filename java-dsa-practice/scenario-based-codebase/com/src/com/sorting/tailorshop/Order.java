package com.sorting.tailorshop;

class Order {
    int orderId;
    String customerName;
    int deliveryDay;

    // Constructor
    Order(int orderId, String customerName, int deliveryDay) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryDay = deliveryDay;
    }
}
