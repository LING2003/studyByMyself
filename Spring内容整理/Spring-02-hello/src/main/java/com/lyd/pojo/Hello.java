package com.lyd.pojo;

public class Hello {
    private String name;

    static Hello createHello() {
        return new Hello();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("Hello "+name);
    }
}
