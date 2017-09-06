package com.example.demo1.domain;

import org.springframework.data.annotation.Id;

/**
 * author:fhj
 * date:2017/6/29 0029 14:48
 */
public class Student {
    @Id
    private String id;
    private Integer age;
    private String name;

    public Student(String id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
