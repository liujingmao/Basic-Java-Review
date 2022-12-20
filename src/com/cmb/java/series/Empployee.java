package com.cmb.java.series;

import java.io.Serializable;

/**
 *  1. what is Serialization:  The process object transfer to serialized byte
 *
 */

public class Empployee implements Serializable {

    public String name;
    public String address;
    public transient int SSN;

    public int number;
    public void mailCheck(){
        System.out.println("Mailing a check to " + name + " " + address);
    }



}
