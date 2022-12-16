package com.cmb.java.arraylist;

public class Order {

    private String OrderId;

    private String OrderName;

    private String OrderTime;

    private double OrderAmount;

    public Order(String orderId, String orderName, String orderTime, double orderAmount) {
        OrderId = orderId;
        OrderName = orderName;
        OrderTime = orderTime;
        OrderAmount = orderAmount;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        OrderName = orderName;
    }

    public String getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(String orderTime) {
        OrderTime = orderTime;
    }

    public double getOrderAmount() {
        return OrderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        OrderAmount = orderAmount;
    }

    public String toString() {
        return "Order{" +
                "OrderId='" + OrderId + '\'' +
                ", OrderName='" + OrderName + '\'' +
                ", OrderTime='" + OrderTime + '\'' +
                ", OrderAmount=" + OrderAmount +
                '}';
    }
}
