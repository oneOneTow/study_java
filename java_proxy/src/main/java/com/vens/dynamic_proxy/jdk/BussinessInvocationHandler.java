package com.vens.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/26
 */
public class BussinessInvocationHandler implements InvocationHandler {
    private Object target;

    public BussinessInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before say hello");
        Object result = method.invoke(this.target, args);
        System.out.println("after say hello");
        return result;
    }
}
