package com.vens.study.redisson;

import java.io.IOException;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/14
 */
public class ConfigUse {
    public static void main(String[] args) throws IOException {
        RLockHelper.acquire("myLock");
        System.out.println("ok ........................");
        RLockHelper.release("myLock");
    }
}
