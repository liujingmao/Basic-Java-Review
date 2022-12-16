package com.cmb.java.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    /**
     * ArrayList Learn
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order("1","LifeTime","2022-12-23",23456.34);

        Order order2 = new Order("2","LifeTime2","2022-12-13",234.34);

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(order);

        orders.add(order2);

        for (Order or:orders
             ) {
            System.out.println(or);
        }
    }






}
