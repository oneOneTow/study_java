package com.vens.study.singleton;

/**
 * @author LuZhiqing
 * @Description: 饿汉式单例
 * @date 2018/12/10
 */
public class HungryMan {
    //在类加载中的准备阶段就会显示的赋值
    private final static HungryMan instance=new HungryMan();

    private String des;

    private HungryMan(){
        this.des="vens";
    }

    public static HungryMan getInstance(){
        return instance;
    }
}
