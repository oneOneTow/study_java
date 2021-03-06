package com.vens.sort;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/11/5
 */
public class QuickSort {
    /**
     * 快速排序思路：
     * int len=arr.length;
     * 1.选取一个基数，一般情况选择第一个元素即baseValue=arr[0]
     * 2.从数组最右边向左移动，动作是如果baseValue<arr[len],继续比较arr[j],如果baseValue>arr[j],就交换arr[i]和arr[j]
     * 3.然后又从左向右移动，动作是如果arr[i]<baseValue,继续比较arr[i],如果baseValue<arr[i],就交换arr[i]和arr[j]
     * 4.再重复2.3步骤，直到i==j。
     * 经过上面5步得到position,然后递归对position左边数组进行排序，对position右边数组进行排序
     * 时间复杂度：
     *          最好：O(nlogn)
     *          平均：O(nlogn)
     *          最差：O(n*n)
     * 稳定性：
     *          非稳定排序
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
