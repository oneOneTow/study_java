package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/11
 */
public class StaticInner {
    private StaticInner(){}
    private static class StaticInnerInstance{
        private static final StaticInner instance=new StaticInner();
    }
    public static StaticInner getInstance(){
        return StaticInnerInstance.instance;
    }
}
