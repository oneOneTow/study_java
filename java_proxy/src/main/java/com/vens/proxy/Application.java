package com.vens.proxy;

/**
 * @author LuZhiqing
 * @Description: ��ں�����
 * @date 2018/9/26
 */
public class Application {
    public static void main(String [] args){
        Bussiness bussiness = new ProxyFactory().getInstance();
        bussiness.execute("vens");
    }
}
