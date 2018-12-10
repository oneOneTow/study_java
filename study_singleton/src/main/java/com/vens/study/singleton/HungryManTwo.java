package com.vens.study.singleton;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/10
 */
public class HungryManTwo {
    private static HungryManTwo instance;

    //在初始化阶段执行
    static{
        instance=new HungryManTwo();
    }
    private HungryManTwo(){}

    public static HungryManTwo getInstance(){
        return instance;
    }
}
