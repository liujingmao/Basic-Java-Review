package com.cmb.java.overload;

public class student {

    private String name;
    private int age;
    private String school;

    public int compute(int a,int b) {
        return a+b;
    }

    public double compute(double a,double b){
        return a+b;
    }

    public String compute(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {

        student stu = new student();

        stu.compute(1,2);

        System.out.println(stu.compute(1,2));
        // STOPSHIP: 2022/11/14
        stu.compute(1.2,4.5);
        System.out.println(stu.compute(1.2,4.5));

        stu.compute("a","b");
        System.out.println(stu.compute("a","b"));
    }


}
