package com.cmb.java.extend;

public class VirtualTest {

    public static void main(String[] args) {

        Salary s  = new Salary("Empl","Beijing",3,3600);
        Employee e = new Salary("Emplb","ShangHai",2,2400);

        System.out.println("use Salary class mailCheck----");
        s.mailCheck();

        System.out.println("use Employ class's mailCheck----");
        e.mailCheck();


    }
}
