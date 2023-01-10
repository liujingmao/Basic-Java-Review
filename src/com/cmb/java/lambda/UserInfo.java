package com.cmb.java.lambda;

public class UserInfo {
    private long Id;
    private String name;
    private int age;

    private String address;

    public UserInfo(long id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserInfo(long id, String name, int age, String address) {
        Id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
