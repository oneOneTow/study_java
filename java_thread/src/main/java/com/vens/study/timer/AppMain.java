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
        //timer��ͨ�����߳���ִ���������һ��taskִ��ʱ������ͻ�Ӱ�������̵߳�ʱЧ��
        //timer�������쳣����һ��task�����쳣������δִ�е�task�����ᱻִ��
        //timer�ǻ��ھ���ʱ���
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("time");
            }
        },100000000);
    }
}
