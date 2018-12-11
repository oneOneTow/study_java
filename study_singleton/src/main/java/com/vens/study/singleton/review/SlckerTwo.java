package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * 线程安全，不足在于每次获取instance的时候，都会阻塞，性能不好
 * @date 2018/12/11
 */
public class SlckerTwo {
    private static SlckerTwo instance;
    private SlckerTwo(){}
    public static synchronized SlckerTwo getInstance(){
        if(instance==null){
            instance=new SlckerTwo();
        }
        return instance;
    }
}
