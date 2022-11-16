package com.cmb.java.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRReadLines {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter lines of text");
        System.out.println("Enger 'end' to quit");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
