package com.cmb.java.scaner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("next 方式接收");

        /*if (scanner.hasNext()){

            String str1 = scanner.next();

            System.out.println("Input Data is:"+ str1);

        }
        */
        while (true){
            String str = scanner.next();
            System.out.println("Input data is:" + str);

            if (str.equals("exist")){
                System.out.println("Input finished");
                return;
            }

        }

       // scanner.close();
    }
}
