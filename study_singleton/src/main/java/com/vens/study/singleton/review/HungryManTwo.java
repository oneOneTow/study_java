package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * 不足同HungryMan，只不过使用了静态代码块
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
