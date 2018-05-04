package com.example.demo.entity;

import javax.persistence.Entity;

/**
 * Created by fengli on 2017/9/6.
 */
@Entity
public class Girl {

    private Integer id;
    private String girlname;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGirlname() {
        return girlname;
    }

    public void setGirlname(String girlname) {
        this.girlname = girlname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
