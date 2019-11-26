package com.Romit.SpringStudy.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("tony")
    public String name;

    @Value("23")
    public String age;


    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
