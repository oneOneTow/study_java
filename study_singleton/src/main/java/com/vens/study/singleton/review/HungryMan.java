package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * �÷�ʽ�Ĳ����������ܼ��ص�ʱ���ʵ�����࣬�п���֮��һֱ�����õ�������ʡ��Դ
 * @date 2018/12/11
 */
public class HungryMan {
    //������׼���׶ξͻᱻ��ֵ
    private static final HungryMan instance=new HungryMan();
    private HungryMan(){}
    public static HungryMan getInstance(){
        return instance;
    }
}
