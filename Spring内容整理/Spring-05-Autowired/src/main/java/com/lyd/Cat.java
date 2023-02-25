package com.lyd;

public class Cat {
private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public   void shout(){
        System.out.println(name+"发出了喵喵的声音");
    }
}
