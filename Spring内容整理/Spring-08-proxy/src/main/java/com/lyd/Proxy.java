package com.lyd;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fee();
    }
    void fee(){
        System.out.println("收中介费");
    }
    void seeHouse(){
        System.out.println("带租客看房子");
    }
}
