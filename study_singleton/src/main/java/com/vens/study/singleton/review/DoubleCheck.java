package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * 线程安全，懒加载，也解决了同步阻塞
 * @date 2018/12/11
 */
public class DoubleCheck {
    private static DoubleCheck instance;
    private DoubleCheck(){}

    public static DoubleCheck getInstance() {
        //精髓:当已经实例化对象后，获取实例，就不需要同步阻塞
        if(instance==null){
            synchronized (DoubleCheck.class){
                //精髓:在上一个if可能存在好多线程判断为true,虽然会存在synchronized，
                // 还是会创建多个实例，等之前的线程创建好后再穿件而已，
                // 再使用一个if判断，只要之前实例化了，此时就不会再实例化了，这里不存在多个线程，因为已经在同步代码内
                if(null==instance){
                    instance=new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
