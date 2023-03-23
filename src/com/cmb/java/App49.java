package com.cmb.java;

import java.util.*;
import java.util.stream.Collectors;

public class App49 {



    public static void main(String[] args) {

        List<UserInfo> iList = new ArrayList<>();
        iList.add(new UserInfo("ffa",31));
        iList.add(new UserInfo("bff",23));
        iList.add(new UserInfo("ff",33));
        iList.add(new UserInfo("fff",12));
        iList.add(new UserInfo("ggg",12));
        iList.add(new UserInfo("ggg",23));

        // toMap
       // System.out.println(iList);

        Optional<UserInfo> userInfoOptional = iList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(UserInfo::getAge)));
        System.out.println("user's max age:"+userInfoOptional.get().getAge());

        //get Average Age
        double averageAge = iList.stream()
                .collect(Collectors.averagingDouble(UserInfo::getAge));
        System.out.println("Average Age:"+averageAge);

        Map m = iList.stream().collect(Collectors.toMap(UserInfo::getName,UserInfo::getAge,
                (n,x)->n+x));
        //System.out.println(m);

        //toCollection
        List<UserInfo> infoList2 = new ArrayList<>();
        infoList2.add(new UserInfo("2da",13));
        infoList2.add(new UserInfo("44b",13));
        infoList2.add(new UserInfo("33c",13));
        infoList2.add(new UserInfo("d43",12));
        infoList2.add(new UserInfo("32e",12));
        infoList2.add(new UserInfo("e23",31));

        List<Integer> list = iList.stream().map(UserInfo::getAge).collect(Collectors.toList());
        System.out.println("List:"+list);
        System.out.println(list.getClass());

        //toSet
        Set<Integer> s = iList.stream().map(UserInfo::getAge).collect(Collectors.toSet());
        System.out.println("Set:"+s);
        System.out.println(s.getClass());

        //LinkedList
        LinkedList<Integer> linkedList = iList.stream()
                .map(UserInfo::getAge)
                .collect(Collectors
                        .toCollection(LinkedList::new));
        System.out.println("LinkedList:"+linkedList);
        System.out.println(linkedList.getClass());

    }

}
