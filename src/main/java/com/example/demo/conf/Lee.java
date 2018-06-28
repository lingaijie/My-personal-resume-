package com.example.demo.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.lang.model.element.NestingKind;

@Component
@ConfigurationProperties(prefix = "com.example")
public class Lee{

/*
    //获取application.properties的属性
    @Value("${com.example.name}")
    private String name;
    @Value("${com.example.age}")
    private int age;
    @Value("${com.example.desc}")
    private String desc;
*/

    private String name;
    private  int age;
    private   String desc;
    private  int randomValue;

    public int getRandomValue(){
        return randomValue;
    }

    public void setRandomValue(int value){
        this.randomValue=value;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
