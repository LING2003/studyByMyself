package com.lyd.demo1;

public class Client {
    public static void main(String[] args) {
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        ProxyUserService proxy = new ProxyUserService();
        //使用代理类实现日志功能
       proxy.setUserService(userService);
        proxy.add();
    }
}
