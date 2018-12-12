package com.vens.study.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/11
 */
public class AppMain {
    public static void main(String[] args) {
        //timer是通过单线程来执行任务，如果一个task执行时间过长就会影响其他线程的时效性
        //timer不捕获异常，当一个task出现异常，其他未执行的task将不会被执行
        //timer是基于绝对时间的
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("time");
            }
        },100000000);
    }
}
