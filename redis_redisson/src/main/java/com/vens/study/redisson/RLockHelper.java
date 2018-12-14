package com.vens.study.redisson;

import org.redisson.api.RLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/14
 */
public class RLockHelper {
    private static final Logger logger=LoggerFactory.getLogger(RLockHelper.class);
    public static void acquire(String lockName){
        RLock lock=RedissonFactory.getInstance().getLock(lockName);
        lock.lock();
        logger.info("lock {}",lock);
    }
    public static void acquire(String lockName, long time, TimeUnit timeType){
        RLock lock=RedissonFactory.getInstance().getLock(lockName);
        lock.lock(time,timeType);
        logger.info("lock {}",lock);
    }
    public static void release(String lockName){
        RLock lock=RedissonFactory.getInstance().getLock(lockName);
        lock.unlock();
        logger.info("unlock {}",lock);
    }
}
