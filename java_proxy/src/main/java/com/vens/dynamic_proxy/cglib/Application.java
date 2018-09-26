package com.vens.dynamic_proxy.cglib;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/26
 */
public class Application {
    public static void main(String [] args){
        BussinessImpl object=(BussinessImpl)new ProxyFactoryCglib().getInstance(new BussinessImpl());
        object.sayHello("cglib");
    }
}
