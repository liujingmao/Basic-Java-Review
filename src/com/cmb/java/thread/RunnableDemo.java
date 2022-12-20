package com.cmb.java.thread;

/**
 *  1. What is Thread
 *  2. Dif between thread and process
 *  3. method to create thread
 */

public class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;
    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating:"+ threadName);
    }

    @Override
    public void run() {
        System.out.println("Running"+threadName);
        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread: " + threadName+","+i);
                Thread.sleep(50);
            }

        } catch (InterruptedException e){
            System.out.println("Thread:"+threadName+","+"Interrupted.");
        }
        System.out.println("Thread:" + threadName+" is exiting.");
    }

    public void start(){
        System.out.println("Starting>>>"+threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
