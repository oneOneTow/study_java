package com.vens.dynamic_proxy.cglib;

/**
 * @author LuZhiqing
 * @Description: 没有实现接口的业务类
 * @date 2018/9/26
 */
public class BussinessImpl {
    public String sayHello(String name) {
        System.out.println("hello " + name);
        return "ok";
    }
}
