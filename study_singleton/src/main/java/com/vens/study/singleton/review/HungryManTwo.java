package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * ����ͬHungryMan��ֻ����ʹ���˾�̬�����
 * @date 2018/12/11
 */
public class HungryManTwo {
    private static HungryManTwo instance;
    static{
        instance=new HungryManTwo();
    }
    private HungryManTwo(){

    }
    public static HungryManTwo getInstance(){
        return instance;
    }
}
