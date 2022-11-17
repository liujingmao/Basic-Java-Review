package com.cmb.java.lock;



public class Interesting {

    public static void main(String[] args) {

        Interesting interesting = new Interesting();

        new Thread(()->interesting.add()).start();
        new Thread(()-> interesting.compare()).start();

    }

    volatile int a = 1;
    volatile int b = 1;

    public synchronized void  add(){

        System.out.println("add start");
        for (int i =0;i<10000;i++){
            a++;
            b++;

        }
        System.out.println("add done");
    }

    public synchronized void compare(){
        System.out.println("compare start");
        for (int i = 0;i<10000;i++){
            if (a<b){
                System.out.println("a:{},b:{},{}:...a:"+a+"<b:"+b);
            }
        }
        System.out.println("compare done");

    }
}
