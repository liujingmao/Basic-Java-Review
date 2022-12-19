package com.cmb.java.generics;


import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符一般是使用 ? 代替具体的类型参数。
 * 例如 List<?> 在逻辑上是 List<String>,List<Integer> 等所有 List<具体类型实参> 的父类
 */

public class GenericTest2 {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();

        name.add("inco");
        age.add(18);
        numbers.add(314);

        getData(name);
        getData(age);
        getData(numbers);

    }

    public static void getData(List<?> data){

        System.out.println("data: "+ data.get(0));
    }
}
