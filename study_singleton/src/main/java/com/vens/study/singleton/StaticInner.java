package com.vens.study.singleton;

/**
 * @author LuZhiqing
 * @Description:
 * �Ƽ�ʹ��
 * @date 2018/12/10
 */
public class StaticInner {
    private StaticInner(){}
    private static class SingletonInstance{
        private static final StaticInner instance=new StaticInner();
    }
    public static StaticInner getInsance(){
        return SingletonInstance.instance;
    }
}
