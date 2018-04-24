package com.lyc.test.booapp.event;

import org.springframework.stereotype.Component;

/**
 * Created by liyuanchao on 4/23/18.
 */
@Component
public class User {
    private String name;
    private int age;

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
