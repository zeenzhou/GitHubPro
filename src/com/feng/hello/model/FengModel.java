package com.feng.hello.model;

/**
 * Created by feng on 2016/12/11.
 */
public class FengModel {
    private String name;
    private Integer age;
    private Integer sexy;

    public static void main(String[] args) {
        System.out.println("hello");
        FengModel fm = new FengModel();
        System.out.println(fm);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSexy() {
        return sexy;
    }

    public void setSexy(Integer sexy) {
        this.sexy = sexy;
    }
}
