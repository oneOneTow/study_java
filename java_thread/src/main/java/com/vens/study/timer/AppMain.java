package com.vens.study.timer;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/11
 */
public class AppMain {
    public static void main(String[] args) {
//        //timer��ͨ�����߳���ִ���������һ��taskִ��ʱ������ͻ�Ӱ�������̵߳�ʱЧ��
//        //timer�������쳣����һ��task�����쳣������δִ�е�task�����ᱻִ��
//        //timer�ǻ��ھ���ʱ���
//        Timer timer=new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("time");
//            }
//        },100000000);
        List<test> ts = new ArrayList<>();
        ts.add(new test());
        List<test> ts1 = ts;
        test t2 = new test();
        t2.a="sdfsdfsdf";
        ts1.set(0,t2);
    }

}
class test{
    public String a = "sdf";
}
