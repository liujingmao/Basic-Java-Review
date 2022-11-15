package com.cmb.java.extend;

public class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(){}

    public Employee(String name, String address, int number) {
        System.out.println("Employ Constructor");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Check mail to"+this.name+" "+this.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newaddress) {
        newaddress = address;
    }

    public int getNumber(){
        return number;
    }
}
