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
        //继承Thread
        new ThreadOne().start();
        //实现runnable接口
        new Thread(new ThreadTwo()).start();
        //实现callable接口
        Callable<String> callable=new ThreadThree<>();
        FutureTask<String> task=new FutureTask<>(callable);
        new Thread(task).start();
    }
}

/**
 * 继承实现线程
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
 * 实现runnable接口实现线程
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
 * 实现callable开启一个线程，有返回值
 * @param <T>
 */
class ThreadThree<T> implements Callable<T>{
    @Override
    public T call() {
        System.out.println("callable run ......");
        return (T)"返回值";
    }

    public static void main(String[] args) {
        Callable<String> callable=new ThreadThree<>();
        FutureTask<String> task=new FutureTask<>(callable);
        new Thread(task).start();
    }
}
