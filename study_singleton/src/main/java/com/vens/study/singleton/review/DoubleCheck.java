package com.vens.study.singleton.review;

/**
 * @author LuZhiqing
 * @Description:
 * �̰߳�ȫ�������أ�Ҳ�����ͬ������
 * @date 2018/12/11
 */
public class DoubleCheck {
    private static DoubleCheck instance;
    private DoubleCheck(){}

    public static DoubleCheck getInstance() {
        //����:���Ѿ�ʵ��������󣬻�ȡʵ�����Ͳ���Ҫͬ������
        if(instance==null){
            synchronized (DoubleCheck.class){
                //����:����һ��if���ܴ��ںö��߳��ж�Ϊtrue,��Ȼ�����synchronized��
                // ���ǻᴴ�����ʵ������֮ǰ���̴߳����ú��ٴ������ѣ�
                // ��ʹ��һ��if�жϣ�ֻҪ֮ǰʵ�����ˣ���ʱ�Ͳ�����ʵ�����ˣ����ﲻ���ڶ���̣߳���Ϊ�Ѿ���ͬ��������
                if(null==instance){
                    instance=new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
