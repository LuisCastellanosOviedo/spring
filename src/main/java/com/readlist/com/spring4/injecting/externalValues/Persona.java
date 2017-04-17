package com.readlist.com.spring4.injecting.externalValues;

import org.springframework.stereotype.Component;

/**
 * Created by luis on 4/11/2017.
 */
@Component
public class Persona {


    private String name;
    private int    age;

    public Persona() {
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
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
