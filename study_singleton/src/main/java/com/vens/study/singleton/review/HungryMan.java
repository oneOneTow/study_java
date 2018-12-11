package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * 该方式的不足在于在能加载的时候就实例化类，有可能之后一直不会用到，不节省资源
 * @date 2018/12/11
 */
public class HungryMan {
    //常量在准备阶段就会被赋值
    private static final HungryMan instance=new HungryMan();
    private HungryMan(){}
    public static HungryMan getInstance(){
        return instance;
    }
}
