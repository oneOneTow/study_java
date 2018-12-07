package com.vens.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/26
 */
public class Application {
    public static void main(String[] args) {
        //ͨ���������ķ�ʽ���ɴ����࣬ʵ��Ҳ�ǵ�����Proxy.newProxyInstance������
        Bussiness obj = new BussinessImpl();
        Bussiness proxy = new ProxyFactory(obj).getProxyInstance();
        proxy.execute("luzhiqing");

        //���ڴ���ͬ�ĵط���invoke��ʵ�ֶ�̬�仯����д�����ʱ�����ɴ�������ʵ��
        Bussiness objNew = new BussinessImpl();
        Bussiness proxyNew = (Bussiness) Proxy.newProxyInstance(objNew.getClass().getClassLoader(), objNew.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("hello before");
                Object result = method.invoke(objNew, args);
                System.out.println("hello after");
                return result;
            }
        });
        //ʹ��lamda���������,ûɶ�ر�
        proxyNew.execute("luzhiqing");
        Bussiness objLamda = new BussinessImpl();
        Bussiness proxyObjLamda = (Bussiness) Proxy.newProxyInstance(objLamda.getClass().getClassLoader(), objLamda.getClass().getInterfaces(),
                (Object proxyLamda, Method methodLamda, Object[] argLamda) -> {
                    System.out.println("hello before");
                    Object result = methodLamda.invoke(objLamda, argLamda);
                    System.out.println("hello after");
                    return result;
                });

        proxyObjLamda.execute("luzhiqing");
    }
}
