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
        //sunmit会返回一个FutureTask
        threadPool.submit(()-> System.out.println(Thread.currentThread().getName()));
        //sunmit会返回一个FutureTask能拿到返回值
        threadPool.submit(()-> "sdfsd");


        //代替Timer，最大线程数是Integer.MAX_VALUE,你说可怕不可怕，突然怼来2147483647个线程，请问这个世界上谁的机子扛得住，不知道神威太湖之光怎么样？
        Executor executor=new ScheduledThreadPoolExecutor(10,new CustomThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        ((ScheduledThreadPoolExecutor) executor).schedule(()-> System.out.println("delay ....."),10,TimeUnit.SECONDS);


        //创建定长线程数的pool,可以控制并发数，
        // queue是new LinkedBlockingQueue<Runnable>()，无界你懂的
        Executors.newFixedThreadPool(10,new CustomThreadFactory());
        //只有唯一的线程，能保证所有任务按照指定顺序执行（FIFO.....）
        //queue是new LinkedBlockingQueue<Runnable>()，无界你懂的
        Executors.newSingleThreadExecutor(new CustomThreadFactory());
        //没什么特别和ScheduledThreadPoolExecutor一样,最大线程数是Integer.MAX_VALUE
        Executors.newScheduledThreadPool(20,new CustomThreadFactory());
        //最大线程数是Integer.MAX_VALUE
        // queue是new SynchronousQueue<Runnable>()
        //SynchronousQueue:特点是生产者线程对其的插入操作put必须等待消费者的移除操作take，反过来也一样。
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
