package com.lyd.demo2;



public class Client {
    public static void main(String[] args) {
        //真实对象
        Host host = new Host();
        //代理对象的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);//设置要代理的对象
        Rent proxy = (Rent) pih.getProxy();//动态生成代理接口
        proxy.rent();
    }

}
