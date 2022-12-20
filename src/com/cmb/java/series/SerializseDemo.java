package com.cmb.java.series;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *请注意，一个类的对象要想序列化成功，必须满足两个条件：
 *
 * 该类必须实现 java.io.Serializable 接口。
 *
 * 该类的所有属性必须是可序列化的。
 *
 * 如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 *
 * 如果你想知道一个 Java 标准类是否是可序列化的，请查看该类的文档。
 *
 * 检验一个类的实例是否能序列化十分简单， 只需要查看该类有没有实现 java.io.Serializable接口。
 */

public class SerializseDemo {

    public static void main(String[] args) {

        Empployee e = new Empployee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan,Ambehta Peer";
        e.SSN = 111233;
        e.number = 101;
        try{
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf(" in /tmp/employee.ser");
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}
