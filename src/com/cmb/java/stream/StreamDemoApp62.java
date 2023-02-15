package com.cmb.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemoApp62 {
    public static void main(String[] args) {

        System.out.println("******First Method *******");

        int[] d = {5,6,7,8,10};
        IntStream s1 = Arrays.stream(d);
        s1.forEach(System.out::println);

        System.out.println("*****Second Method ********");

        Stream<int[]> t = Stream.of(d);

        IntStream s2 = t.flatMapToInt(i->Arrays.stream(i));
        s2.forEach(System.out::println);

        User[] user = {new User("xiaomin",23,4567.89),
        new User("XiaoHong",22,45632.00)};

        Stream<User> userStream = Arrays.stream(user);
        userStream.forEach(System.out::println);

        Stream<User> userStream1 = Stream.of(user);
        long count = userStream1.filter(x -> x.getAge() > 20).count();
        System.out.println(count);


    }
}
