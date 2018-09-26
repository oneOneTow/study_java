package com.vens.dynamic_proxy;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/26
 */
public class Application {
    public static void main(String [] args){
        Bussiness proxy = new ProxyFactory(new BussinessImpl()).getProxyInstance();
        proxy.execute("luzhiqing");
    }
}
