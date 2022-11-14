package com.cmb.java.override;

public class Dog extends Animal{

    public String eat(){

        return "Eating Bones";

    }

    @Override
    public void move() {
        //调用父类的方法
        //super.move();
        System.out.println("Dog move with four legs");
    }


}
