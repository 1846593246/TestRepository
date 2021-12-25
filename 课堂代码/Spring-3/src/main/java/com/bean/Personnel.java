package com.bean;

import java.util.Objects;

public class Personnel {

    public void init(){
        System.out.println("Personnel类中的init方法被调用了");
    }

    public void destroy(){
        System.out.println("Personnel类中的destory方法被调用了");
    }
    public Personnel(){
        System.out.println("Personnel对象被创建");
    };

    private String name;//张三
    private Integer age;//18
    private int height;//180

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }


    //李四
    //16
    //170

    public Personnel(String name, Integer age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return height == personnel.height &&
                Objects.equals(name, personnel.name) &&
                Objects.equals(age, personnel.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
