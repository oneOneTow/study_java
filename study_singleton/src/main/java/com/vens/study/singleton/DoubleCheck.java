package com.vens.study.singleton;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/10
 */
public class DoubleCheck {
    private static DoubleCheck doubleCheck;
    private DoubleCheck(){}
    public static  DoubleCheck getInstance(){
        if(doubleCheck==null){
            synchronized (SlackerThree.class) {
                if(doubleCheck==null){
                    doubleCheck=new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
