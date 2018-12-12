package com.vens.sort;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/11/5
 */
public class QuickSort {
    /**
     * ��������˼·��
     * int len=arr.length;
     * 1.ѡȡһ��������һ�����ѡ���һ��Ԫ�ؼ�baseValue=arr[0]
     * 2.���������ұ������ƶ������������baseValue<arr[len],�����Ƚ�arr[j],���baseValue>arr[j],�ͽ���arr[i]��arr[j]
     * 3.Ȼ���ִ��������ƶ������������arr[i]<baseValue,�����Ƚ�arr[i],���baseValue<arr[i],�ͽ���arr[i]��arr[j]
     * 4.���ظ�2.3���裬ֱ��i==j��
     * ��������5���õ�position,Ȼ��ݹ��position�������������򣬶�position�ұ������������
     * ʱ�临�Ӷȣ�
     *          ��ã�O(nlogn)
     *          ƽ����O(nlogn)
     *          ��O(n*n)
     * �ȶ��ԣ�
     *          ���ȶ�����
     * @return
     */
    public static void sort(int [] arr,int low,int high){
        if(low>=high){
            return ;}
        int pos=position(arr,low,high);
        sort(arr,low,pos-1);
        sort(arr,pos+1,high);
    }
    public static int position(int [] arr,int low,int high){
        int i=low;
        int j=high;
        int baseValue=arr[low];
        while(i!=j){
            while(i<j){
                if(baseValue<arr[j]){
                    j--;
                }else {
                    swap(arr,i,j);
                    i++;
                    break;
                }

            }
            while(i<j){
                if(baseValue>arr[i]){
                    i++;
                }else{
                    swap(arr,i,j);
                    j--;
                    break;
                }
            }

        }
        return j;
    }
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int [] arr=new int[]{9,8,5,6,8,9,1,2,4,3,10};
        sort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }

}