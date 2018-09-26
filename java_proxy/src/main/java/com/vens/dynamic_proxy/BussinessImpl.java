package com.vens.dynamic_proxy;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/26
 */
public class BussinessImpl implements Bussiness{
    @Override
    public String execute(String name) {
        System.out.println("hello "+name);
        return "ok";
    }
}
