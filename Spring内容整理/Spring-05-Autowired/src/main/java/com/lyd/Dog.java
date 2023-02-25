package com.lyd;

public class Dog {
private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public   void shout(){
        System.out.println(name+"向陌生人说了句：旺旺~");
    }

}
