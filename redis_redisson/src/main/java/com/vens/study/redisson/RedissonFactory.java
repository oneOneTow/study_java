package com.vens.study.redisson;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.io.File;
import java.io.IOException;
import java.net.URL;


/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/14
 */
public class RedissonFactory {
    private static RedissonClient redisson;

    static {
        URL resource = ConfigUse.class.getClassLoader().getResource("redisson-config-single.json");
        File file=new File(resource.getFile());
        Config config=null;
        try {
            config=Config.fromJSON(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        redisson=Redisson.create(config);
    }

    public static  RedissonClient getInstance(){
        return redisson;
    }
}
