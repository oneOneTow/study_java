package com.vens.study.singleton;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/10
 */
public class SlackerTwo {
    private static SlackerTwo slackerTwo;
    private SlackerTwo(){}
    public static synchronized SlackerTwo getInstance(){
        if(slackerTwo==null){
            slackerTwo=new SlackerTwo();
        }
        return slackerTwo;
    }
}
