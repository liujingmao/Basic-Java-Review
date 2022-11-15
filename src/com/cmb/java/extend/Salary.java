package com.cmb.java.extend;

public class Salary extends Employee{
    private double salary;

    public Salary(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }

    public void mailCheck(){
        System.out.println("Salary Class's mailCheck Method");
        System.out.println("Mail to :"+getName()+" "+salary);
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double newsalary) {
        if (newsalary>0)
        salary = newsalary;
    }

    public double computePay(){
        System.out.println("Pay:"+ getAddress());
        return salary/52;
    }


}
