package com.vens.study.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/11
 */
public class ThreadImplemment {

    public static void main(String[] args) {
        //�̳�Thread
        new ThreadOne().start();
        //ʵ��runnable�ӿ�
        new Thread(new ThreadTwo()).start();
        //ʵ��callable�ӿ�
        Callable<String> callable=new ThreadThree<>();
        FutureTask<String> task=new FutureTask<>(callable);
        new Thread(task).start();
    }
}

/**
 * �̳�ʵ���߳�
 */
class ThreadOne extends Thread{
    @Override
    public void run() {
        System.out.println("thread run......");
    }

    public static void main(String[] args) {
        new ThreadOne().start();
    }
}

/**
 * ʵ��runnable�ӿ�ʵ���߳�
 */
class ThreadTwo implements Runnable{

    @Override
    public void run() {
        System.out.println("runnable run ....");
    }

    public static void main(String[] args) {
        new Thread(new ThreadTwo()).start();
    }
}

/**
 * ʵ��callable����һ���̣߳��з���ֵ
 * @param <T>
 */
class ThreadThree<T> implements Callable<T>{
    @Override
    public T call() {
        System.out.println("callable run ......");
        return (T)"����ֵ";
    }

    public static void main(String[] args) {
        Callable<String> callable=new ThreadThree<>();
        FutureTask<String> task=new FutureTask<>(callable);
        new Thread(task).start();
    }
}
