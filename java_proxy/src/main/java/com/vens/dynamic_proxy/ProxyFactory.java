package com.vens.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/26
 */
public class ProxyFactory {
    private Bussiness target;

    public ProxyFactory(Bussiness target) {
        this.target = target;
    }

    Bussiness getProxyInstance() {
        ClassLoader classLoader = this.target.getClass().getClassLoader();
        Class[] classes = this.target.getClass().getInterfaces();
        Object proxy = Proxy.newProxyInstance(classLoader, classes, new BussinessInvocationHandler(target));
        return (Bussiness) proxy;
    }
}
