package com.cmb.java.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListRemoveDemo {

    public List<String> initList = Arrays.asList("张三","李四","周一","刘四","李强","李白");

    /**
     * 不可靠的方法，
     */
    public void removev1(){
        List<String> list = new ArrayList<>(initList);
        for (int i=0;i<list.size();i++){
            String str = list.get(i);
            if (str.startsWith("李")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    /**
     * 抛异常out of Index
     */

    public void removev2(){
        List<String> list = new ArrayList<>(initList);
        int size = list.size();
        for (int i = 0;i<size;i++){
            String str = list.get(i);
            if (str.startsWith("李")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }


    /**
     * 比较可靠
     */

    public void removev3(){
        List<String> list = new ArrayList<>(initList);
        int size = list.size();
        for (int i = size-1;i>0;i--){
            String str = list.get(i);
            if (str.startsWith("李")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    /**
     * 抛异常
     */
    public void removev4(){
        List<String> list = new ArrayList<>(initList);
        for (String e:list){
            if (e.startsWith("李")){
                list.remove(e);
            }
        }
        System.out.println(list);
    }

    /**
     * 可靠的方法
     */

    public void removev5(){
        List<String> list = new ArrayList<>(initList);
        for (Iterator<String> iterator=list.iterator();iterator.hasNext();){
            String str = iterator.next();
            if (str.contains("李")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    /**
     *  抛异常
     */

    public void removev6(){
        List<String> list = new ArrayList<>(initList);
        for (Iterator<String> iterator=list.iterator();iterator.hasNext();){
            String str = iterator.next();
            if (str.contains("李")){
                list.remove(str);
            }
        }
        System.out.println(list);
    }

    /**
     * 抛异常
     */

    public void removev7(){
        List<String> list = new ArrayList<>(initList);
        list.forEach((e)->{
            if (e.contains("李")){
                list.remove(e);
            }
        });

        System.out.println(list);
    }

    /**
     * 可靠，挺6的方法
     */

    public void removev8(){
        List<String> list = new ArrayList<>(initList);
        list = list.stream().filter(e->!e.startsWith("李")).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void main(String[] args) {

        ArrayListRemoveDemo arrayListRemoveDemo = new ArrayListRemoveDemo();
        //arrayListRemoveDemo.removev1();
        //arrayListRemoveDemo.removev2();
        //arrayListRemoveDemo.removev3();
        //arrayListRemoveDemo.removev4();
        arrayListRemoveDemo.removev5();
        //arrayListRemoveDemo.removev6();
        arrayListRemoveDemo.removev7();
        arrayListRemoveDemo.removev8();
    }
}
