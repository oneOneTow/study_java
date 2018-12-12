package com.vens.study.threadpool;

import org.springframework.core.task.TaskDecorator;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/11
 */
public class AppMain {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPool =
                new ThreadPoolExecutor(
                        100,
                        200,
                        60,
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(500));

        threadPool.execute(()-> System.out.println(Thread.currentThread().getName()));
        //sunmit�᷵��һ��FutureTask
        threadPool.submit(()-> System.out.println(Thread.currentThread().getName()));
        //sunmit�᷵��һ��FutureTask���õ�����ֵ
        threadPool.submit(()-> "sdfsd");


        //����Timer������߳�����Integer.MAX_VALUE,��˵���²����£�ͻȻ���2147483647���̣߳��������������˭�Ļ��ӿ���ס����֪������̫��֮����ô����
        Executor executor=new ScheduledThreadPoolExecutor(10,new CustomThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        ((ScheduledThreadPoolExecutor) executor).schedule(()-> System.out.println("delay ....."),10,TimeUnit.SECONDS);


        //���������߳�����pool,���Կ��Ʋ�������
        // queue��new LinkedBlockingQueue<Runnable>()���޽��㶮��
        Executors.newFixedThreadPool(10,new CustomThreadFactory());
        //ֻ��Ψһ���̣߳��ܱ�֤����������ָ��˳��ִ�У�FIFO.....��
        //queue��new LinkedBlockingQueue<Runnable>()���޽��㶮��
        Executors.newSingleThreadExecutor(new CustomThreadFactory());
        //ûʲô�ر��ScheduledThreadPoolExecutorһ��,����߳�����Integer.MAX_VALUE
        Executors.newScheduledThreadPool(20,new CustomThreadFactory());
        //����߳�����Integer.MAX_VALUE
        // queue��new SynchronousQueue<Runnable>()
        //SynchronousQueue:�ص����������̶߳���Ĳ������put����ȴ������ߵ��Ƴ�����take��������Ҳһ����
        Executors.newCachedThreadPool(new CustomThreadFactory());


        ThreadPoolTaskExecutor springThreadPool = new ThreadPoolTaskExecutor();
        springThreadPool.setCorePoolSize(10);
        springThreadPool.setMaxPoolSize(20);
        springThreadPool.setKeepAliveSeconds(10);
        springThreadPool.setQueueCapacity(60);
        springThreadPool.setAllowCoreThreadTimeOut(true);
        springThreadPool.setTaskDecorator(new TaskDecorator(){
            @Override
            public Runnable decorate(Runnable runnable) {
                Thread thread=new Thread(runnable);
                thread.setName("thread_name");
                return thread;
            }
        });
    }
}
class CustomThreadFactory implements ThreadFactory{
    private int threadIndex=0;
    @Override
    public Thread newThread(Runnable r) {
        Thread thread=new Thread(r);
        thread.setName("thread_name_"+threadIndex++);
        return thread;
    }
}
