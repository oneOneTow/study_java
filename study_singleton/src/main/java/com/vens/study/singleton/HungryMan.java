package com.vens.study.singleton;

/**
 * @author LuZhiqing
 * @Description: ����ʽ����
 * @date 2018/12/10
 */
public class HungryMan {
    //��������е�׼���׶ξͻ���ʾ�ĸ�ֵ
    private final static HungryMan instance=new HungryMan();

    private String des;

    private HungryMan(){
        this.des="vens";
    }

    public static HungryMan getInstance(){
        return instance;
    }
}
