package com.lyd.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //这是一个万能工具类
    //创建一个万能对象标签👇（被代理的接口）
    private Object target;
    //设置一个Set对象标签的方法
    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }/*
    this.getClass().getClassLoader()得到类加载器
    target.getClass().getInterfaces()得到代理类的接口
    this  调用处理程序
    */


    //proxy:代理类
    //method：代理类的调用处理程序的方法对象
    //👇处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在这里的空行可以添加新的方法👇



        seeHouse();
        //如👇：
        //log(method.getName());
        //以下为创建的返回对象(动态代理的本质就是使用反射机制实现)！
        Object result = method.invoke(target, args);
        fare();
        return result;
    }
    void log(String methodName){
        System.out.println("执行了"+methodName+"方法");
    }
    void seeHouse(){
        System.out.println("中介带看房子");
    }
    void fare(){
        System.out.println("中介收取中介费");
    }
}
