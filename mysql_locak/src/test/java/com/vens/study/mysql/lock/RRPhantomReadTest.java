package com.vens.study.mysql.lock;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/12
 */
public class RRPhantomReadTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"app.xml"});
        RRPhantomRead phantomRead=(RRPhantomRead)context.getBean("rRPhantomRead");
        phantomRead.verifyRepeatedRead();
    }
}
