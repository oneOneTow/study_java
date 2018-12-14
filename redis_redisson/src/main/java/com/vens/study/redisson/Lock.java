package com.vens.study.redisson;

import org.redisson.api.RLock;
import org.redisson.api.RSet;
import org.redisson.api.RedissonClient;


/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/14
 */
public class Lock {
    public static void main(String[] args) throws InterruptedException {
        //配置文件中不要添加"dnsMonitoring"会报错
        RLockHelper.acquire("myLock");
        Thread.currentThread().sleep(1000*20);
        System.out.println("ok ok ok ..............");
        RLockHelper.release("myLock");
        RSet<String> strings=RedissonFactory.getInstance().getSet("");
    }
}
