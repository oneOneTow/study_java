package com.vens.dynamic_proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/26
 */
public class Application {
    public static void main(String [] args){
        BussinessImpl object=(BussinessImpl)new ProxyFactoryCglib().getInstance(new BussinessImpl());
        //解决有参构造函数问题
        object.setName("luzhiqing");
        object.sayHello();
        BussinessImpl obj = new BussinessImpl();
        Enhancer.create(obj.getClass(),new MethodInterceptor(){
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("hello before");
                method.invoke(obj,args);
                System.out.println("hello before");
                return null;
            }
        });
    }
}
