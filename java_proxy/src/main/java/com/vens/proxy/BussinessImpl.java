package com.vens.proxy;

/**
 * @author LuZhiqing
 * @Description: ��Ҫ����Ķ���
 * @date 2018/9/26
 */
public class BussinessImpl implements Bussiness{
    @Override
    public void execute(String name) {
        System.out.println("hello "+name);
    }
}
