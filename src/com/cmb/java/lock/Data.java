package com.cmb.java.lock;

import java.util.stream.IntStream;

public class Data {

    public static void main(String[] args) {

        Data data = new Data();

        reset();

        IntStream.rangeClosed(1,1000).parallel().forEach(i->new Data().right());

        System.out.println(getCounter());
    }

    private static int counter = 0;
    private static Object locker = new Object();

    public static int reset(){
        counter = 0;
        return counter;
    }

    public static int getCounter() {
        return counter;
    }

    public synchronized void wrong(){
        counter++;
    }

    public void right(){
        synchronized (locker){
            counter++;
        }
    }
}
