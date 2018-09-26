package com.vens.proxy;

/**
 * @author LuZhiqing
 * @Description: �����࣬��Ҫʵ�ֺʹ�������ͬ�Ľӿ�
 * @date 2018/9/26
 */
public class BussinessProxy implements Bussiness {
    Bussiness bussiness;

    public BussinessProxy(Bussiness bussiness) {
        this.bussiness = bussiness;
    }

    @Override
    public void execute(String name) {
        System.out.println("before say hello");
        this.bussiness.execute(name);
        System.out.println("after say hello");
    }
}
