package com.cmb.java;

public class Sollution {
    public static void main(String[] args) {

            Sollution sollution = new Sollution();
            int re = sollution.MuandSum(234);

        System.out.println(re);
    }

    public int MuandSum(int n){

        int s  = 0;
        int m = 1;

        while (n>0){

            int l = n%10;

            n = n/10;

            m = m*l;

            s = s+l;


        }
        return m-s;
        }

}
