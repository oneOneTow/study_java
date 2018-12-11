package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * �̰߳�ȫ����������ÿ�λ�ȡinstance��ʱ�򣬶������������ܲ���
 * @date 2018/12/11
 */
public class SlckerTwo {
    private static SlckerTwo instance;
    private SlckerTwo(){}
    public static synchronized SlckerTwo getInstance(){
        if(instance==null){
            instance=new SlckerTwo();
        }
        return instance;
    }
}
