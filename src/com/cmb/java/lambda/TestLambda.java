package com.cmb.java.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        Map<String,List<UserInfo>> result2= originUserInfoList.stream().collect(Collectors.groupingBy(UserInfo::getAddress));
        result2.forEach((k,v)-> System.out.println(k+":\t"+v));
    }
}
