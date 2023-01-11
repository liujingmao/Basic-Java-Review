package com.cmb.java.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLambda {
    public static void main(String[] args) {

        List<UserInfo> userInfoList = new ArrayList<>();

        userInfoList.add(new UserInfo(1L,"AAAAA",18));
        userInfoList.add(new UserInfo(2L,"BBBB",27));
        userInfoList.add(new UserInfo(3L,"CCCC",28));

        /**
         * 之前的增强for循坏
         */

        System.out.println("增强For循坏");

        for (Object user:userInfoList){
            System.out.println(user);
        }

        System.out.println("*******forEach");

        userInfoList.forEach(System.out::println);

        /**
         * list to Map
         * 使用Collectors.toMap,如果有可以重复会报错，所以需要加(k1,k2)->k1
         * 意思是，如果有重复的key，则保留第一个，舍弃第二个
         */
        Map<Long,UserInfo> userInfoMap = userInfoList
                .stream()
                .collect(Collectors.toMap(UserInfo::getId,
                userInfo -> userInfo,(k1,k2)->k1));

        userInfoMap.values().forEach(a-> System.out.println(a.getName()));

        List<UserInfo> userInfoList1 = userInfoList
                .stream()
                .filter(user->user.getAge()>18)
                .collect(Collectors.toList());

        userInfoList1.forEach(user-> System.out.println("Name:"+user.getName()+",Age:"+user.getAge()));

        /**
         * forEach 遍历Map
         */

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("111","xiaoming");
        hashMap.put("222","xiaohong");
        hashMap.put("333","Spark");

        hashMap.forEach((k,v)-> System.out.println(k+":\t"+v));

        /**
         * Groupby
         * Tranditional and Lambda Expression
         */

        List<UserInfo> originUserInfoList = new ArrayList<>();
        originUserInfoList.add(new UserInfo(1L,"AAAAAA",18,"ShenZhen"));
        originUserInfoList.add(new UserInfo(2L,"BBBBBB",26,"Guangzhou"));
        originUserInfoList.add(new UserInfo(3L,"CCCCCC",27,"ShenZhen"));
        originUserInfoList.add(new UserInfo(4L,"DDDDDD",32,"Guangzhou"));

        /**
         * Max min
         */

        System.out.println("****** Max Min ********");

        Optional<UserInfo> maxAgeUserInfoOut = originUserInfoList.stream().max(Comparator.comparing(UserInfo::getAge));
        maxAgeUserInfoOut.ifPresent(userInfo -> System.out.println("max age user info:"+userInfo.getAge()+userInfo));

        Optional<UserInfo> minAgeUserInfoOut = originUserInfoList.stream().min(Comparator.comparing(UserInfo::getAge));
        minAgeUserInfoOut.ifPresent(userInfo -> System.out.println("min age user info:"+userInfo.getAge()+userInfo));


        /**
         * Count
         */

        long count = originUserInfoList.stream().filter(userInfo -> userInfo.getAge()>18).count();
        System.out.println("Age bigger 18:"+count);

        /**
         * 传统的分组
         */

        Map<String,List<UserInfo>> result = new HashMap<>();
        for (UserInfo userInfo:originUserInfoList){
            String city = userInfo.getAddress();
            List<UserInfo> userInfos = result.get(city);
            if (userInfos==null){
                userInfos=new ArrayList<>();
                result.put(city,userInfos);
            }
            userInfos.add(userInfo);
        }
        System.out.println("****************");
        /**
         * Lambda表达式的分组
         */
        Map<String,List<UserInfo>> result2= originUserInfoList.stream().collect(Collectors.groupingBy(UserInfo::getAddress));
        result2.forEach((k,v)-> System.out.println(k+":\t"+v));


        /**
         * Sorted
         */

        originUserInfoList = originUserInfoList.stream()
                .sorted(Comparator.comparing(UserInfo::getAge))
                .collect(Collectors.toList());

        originUserInfoList.forEach(a-> System.out.println(a.toString()));

        System.out.println("开始降序排序");


        originUserInfoList = originUserInfoList.stream()
                .sorted(Comparator.comparing(UserInfo::getAge).reversed()).collect(Collectors.toList());

        originUserInfoList.forEach(b-> System.out.println(b.toString()));

        /**
         * Disticnt 去重
         */

        List<String> list = Arrays.asList("A","B","F","A","C");
        List<String> temp = list.stream()
                .distinct()
                .collect(Collectors.toList());
        temp.forEach(System.out::println);

        /**
         * findFirst
         */

        list.stream().findFirst().ifPresent(System.out::println);

        /**
         * anyMatch
         */

        Stream<String> stream = Stream.of("A","B","F","A","C");
        boolean match = stream.anyMatch(s->s.contains("C"));
        System.out.println(match);

        boolean match2 = stream.allMatch(c->c.contains("F"));
        System.out.println(match2);

        /**
         * map Transform
         */

        List<String> list1 = Arrays.asList("jay","tianluo");
        List<String> upCaseList = list1.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
        upCaseList.forEach(System.out::println);

        /**
         * Reduce
         */

        int sum = Stream.of(1,2,3,4).reduce(0,(a,b)->a+b);
        System.out.println(sum);

        /**
         * Peek()是操作Stream操作，可以使用peek来打印日志
         */

        List<String> list2Result = Stream.of("程序员田螺", "捡田螺的小男孩", "捡瓶子的小男孩")
                .filter(a->a.contains("田螺"))
                .peek(a-> System.out.println("Pulic Hao"+a))
                .collect(Collectors.toList());

        System.out.println(list2Result);


    }
}
