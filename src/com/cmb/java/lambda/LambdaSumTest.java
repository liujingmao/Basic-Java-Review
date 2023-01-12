package com.cmb.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 常用函数式接口
 * ambda离不开函数式接口，我们来看下JDK8常用的几个函数式接口：
 * Function<T, R>（转换型）: 接受一个输入参数，返回一个结果
 * Consumer<T> （消费型）: 接收一个输入参数，并且无返回操作
 * Predicate<T> （判断型）: 接收一个输入参数，并且返回布尔值结果
 * Supplier<T> （供给型）: 无参数，返回结果
 */
public class LambdaSumTest {
    /**
     * 功能转换型的接口，可以把一种类型的数据转化成另外一类型的数据
     */
    private void testFunction(){
        //获取每个字符串的长度
        Function<String,Integer> function = String::length;
        Stream<String> stream = Stream.of("1","22","333");
        Stream<Integer> resultStream = stream.map(function);
        resultStream.forEach(System.out::println);
    }

    private void testComsumer(){
        Consumer<String> consumer=String::toUpperCase;
        Stream<String> stream = Stream.of("aaa","bbb","c");
        stream.forEach(consumer);
    }

    private void testPredicate(){
        Predicate<Integer> predicate = a->a>18;
        UserInfo userInfo = new UserInfo(2L,"BBBB",27);
        System.out.println(predicate.test(userInfo.getAge()));
    }

    private void testSupplier(){
        Supplier<Integer> supplier = ()->Integer.valueOf("666");
        System.out.println(supplier.get());
    }

    private void saveDb(Supplier<Integer> supplier){
        if (supplier.get()>0){
            System.out.println("Insert Data Successfully");
        } else {
            System.out.println("Insert Data Failed");
        }
    }

    public static void main(String[] args) {
        LambdaSumTest lambdaSumTest = new LambdaSumTest();
        lambdaSumTest.testFunction();
        System.out.println("Parting Line*******");
       // lambdaSumTest.testComsumer();
        lambdaSumTest.testPredicate();
        UserInfo userInfo = new UserInfo(3L,"CCCC",23);
       // lambdaSumTest.saveDb(()->);

    }
}
