package com.cmb.java.abstractclass;

/**
 *  1. Abstract class con not be Instancilied
 *  2. has member variable, member method and constructor as common class
 *  3. Because Abstract Class can not be Instantilized, so it can not be used without being implemented
 */

public abstract class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String address;
    private int number;

   /* public Employee(){

    }*/

    public Employee(String name, String address, int number) {
        System.out.println("Construncting an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    /**
     * 如果你想设计这样一个类，该类包含一个特别的成员方法，该方法的具体实现由它的子类确定，那么你可以在父类中声明该方法为抽象方法。
     *
     * Abstract 关键字同样可以用来声明抽象方法，抽象方法只包含一个方法名，而没有方法体。
     *
     * 抽象方法没有定义，方法名后面直接跟一个分号，而不是花括号。
     */

    public abstract double computePay2();

    /**
     * 声明抽象方法会造成以下两个结果：
     *
     * 如果一个类包含抽象方法，那么该类必须是抽象类。
     * 任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
     * 继承抽象方法的子类必须重写该方法。否则，该子类也必须声明为抽象类。
     * 最终，必须有子类实现该抽象方法，否则，从最初的父类到最终的子类都不能用来实例化对象。
     */

    /**
     * . 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
     *
     * 2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
     *
     * 3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
     *
     * 4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
     *
     * 5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
     */

}
