package com.vens.proxy;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/26
 */
public class ProxyFactory {
    public Bussiness getInstance(){
        return new BussinessProxy(new BussinessImpl());
    }
}
