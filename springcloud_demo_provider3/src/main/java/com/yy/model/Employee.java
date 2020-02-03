package com.yy.model;

import java.io.Serializable;

/**
 * Created by skyler on 2017/4/13.
 */
public class Employee implements Serializable{

    private long id;
    private String name;
    private int age;

    public Employee() {}

    public Employee(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
