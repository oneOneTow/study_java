package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * ����ȫ�����Ƽ�ʹ�ã������������ص�����
 * @date 2018/12/11
 */
public class Slacker {
    private static Slacker instance;
    private Slacker(){

    }
    public static Slacker getInstance(){
        if(instance==null){
            instance=new Slacker();
        }
        return instance;
    }


}
