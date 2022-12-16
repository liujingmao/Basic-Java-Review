package com.cmb.java.abstractclass;

public abstract class Salary  extends Employee{

    private double salary;

    public Salary(String name, String address, int number) {
        super(name, address, number);
    }

    public Salary(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
