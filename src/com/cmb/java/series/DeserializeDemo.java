package com.cmb.java.series;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * DeserializeDemo
 */

public class DeserializeDemo {
    public static void main(String[] args) {

        Empployee e = null;
        try{
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInput in = new ObjectInputStream(fileIn);
            e = (Empployee) in.readObject();
            in.close();
            fileIn.close();


        } catch (IOException i){
            i.printStackTrace();
            return;
        } catch( ClassNotFoundException c) {
            System.out.println("Employee class not found");

            c.printStackTrace();
            return;
        }

        System.out.println("Deserverialize class emplyees");
        System.out.println("name:"+e.name);
        System.out.println("addres:"+e.address);
        System.out.println("SSN:"+ e.SSN);
        System.out.println("number:"+e.number);

    }
}
