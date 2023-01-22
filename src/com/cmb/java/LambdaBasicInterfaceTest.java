package com.cmb.java;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 四大核心函数式的用法
 */

public class LambdaBasicInterfaceTest {
    public void co(double m, Consumer<Double> consumer){
        consumer.accept(m);
    }
    public void testConsumer(){

        co(200,x-> System.out.println(x));
    }

    public void testConsumer2(){
        con2("Miss Lie",x-> System.out.println(x));
    }

    public void con2(String str,Consumer<String> consumer){
        consumer.accept(str);
    }

    public void testSupplier(){
        Random r = new Random();
        List<Integer> list = s(10,()->r.nextInt(30));
        for (Integer n:list){
            System.out.println(n);
        }
    }

    public List<Integer> s(int sm, Supplier<Integer> s1) {
        List<Integer> l = new ArrayList<>();
        for (int j=0;j<sm;j++){
            l.add(s1.get());
        }
        return l;
    }

    public String st(String str, Function<String,String> function){
      return   function.apply(str);
    }

    public void testFunction(){
        String s  = st("abc",n->n.substring(0,1));
        System.out.println(s);
    }

    public void testFunction2(){
        String s2 = st("  a  bc   ",s->s.trim());
        System.out.println(s2);
    }
    public void testPredict(){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(17);
        List<Integer> list1 = fInt(list, n -> (n % 2 == 0));
        for (Integer i: list1){
            System.out.println(i);
        }
    }
    public List<Integer> fInt(List<Integer> li, Predicate<Integer> p){
        List<Integer> l = new ArrayList<>();
        for (Integer integer:li){
            if (p.test(integer)){
                l.add(integer);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        LambdaBasicInterfaceTest test = new LambdaBasicInterfaceTest();
        test.testConsumer();
        test.testConsumer2();
        test.testSupplier();
        test.testFunction();
        test.testFunction2();
        test.testPredict();
    }
}
