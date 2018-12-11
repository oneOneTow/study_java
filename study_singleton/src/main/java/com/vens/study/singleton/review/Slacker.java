package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * 不安全，不推荐使用，但是起到懒加载的作用
 * @date 2018/12/11
 */
public class Slacker {
    private static Slacker instance;
    private Slacker(){

    }
    public static Slacker getInstance(){
        if(instance==null){
            instance=new Slacker();
        }
        return instance;
    }


}
