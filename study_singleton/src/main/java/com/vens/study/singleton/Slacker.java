package com.vens.study.singleton;

/**
 * @author LuZhiqing
 * @Description: �̲߳���ȫ
 * @date 2018/12/10
 */
public class Slacker {
    private static Slacker slacker;
    private Slacker(){}
    public static Slacker getInstance(){
        if(slacker==null){
            slacker=new Slacker();
        }
        return slacker;
    }
}
