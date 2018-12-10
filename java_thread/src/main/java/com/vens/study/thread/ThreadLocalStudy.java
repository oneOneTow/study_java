package com.vens.study.thread;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/10
 */
public class ThreadLocalStudy {
    private ThreadLocal<Integer> name=new ThreadLocal<>();

    public ThreadLocal<Integer> getName() {
        return name;
    }

    public void setName(ThreadLocal<Integer> name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ThreadLocalStudy threadLocalStudy=new ThreadLocalStudy();
        Thread t=new Thread(){
            @Override
            public void run() {
                threadLocalStudy.getName().set(50);
                int i=0;
                while(i<20){
                    int a=threadLocalStudy.getName().get()-i;
                    threadLocalStudy.getName().remove();
                    i++;
                }
                threadLocalStudy.getName().get();
            }
        };
        t.start();
    }
}
