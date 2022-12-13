package com.cmb.java.oomdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OomTest {
    public static void main(String[] args) throws InterruptedException {

       new Thread(new Runnable() {
           @Override
           public void run() {
               List<OomTest> list = new ArrayList<>();
               while (true){
                   list.add(new OomTest());
               }
           }
       }).start();

       while (true){
           TimeUnit.SECONDS.sleep(0x3);
       }
    }
}
