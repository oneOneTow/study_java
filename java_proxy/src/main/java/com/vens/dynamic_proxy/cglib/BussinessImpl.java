package com.vens.dynamic_proxy.cglib;

/**
 * @author LuZhiqing
 * @Description: 没有实现接口的业务类
 * @date 2018/9/26
 */
public class BussinessImpl {
    private String name;

    public String sayHello() {
        System.out.println("hello " + this.name);
        return "ok";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
