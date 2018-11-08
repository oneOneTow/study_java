package com.vens.sort;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/11/6
 */
public class HeapSort {

    /**
     * ˼·�����������й���һ������ѣ�Ȼ��root�Ͷ�βԪ�أ���n�������н�����Ȼ���ٽ���ȥ��β��n-1��Ԫ�ص���Ϊ����ѣ�����ĩβԪ�أ���n-1����������˷���ִ��n-1�Ρ�
     * ���裺
     * 1.������ʼ�ѣ�����Ҫ�����������й���һ�������
     * 2.����Ԫ��
     * 3.������
     */
    public static  void sort(Integer[] arr) {
        int len = arr.length - 1;
        while (len > 0) {
            adjustHeap(arr, 0, len);
            swap(arr, 0, len);
            len--;
        }
    }

    public static  void adjustHeap(Integer[] arr, int start, int end) {
        int nodeCount = end + 1;
        int nodeIndex = nodeCount / 2 - 1;
        while (nodeIndex >= start) {
            /**
             * �����������бȽ�
             */
            if (arr[nodeIndex * 2 + 1] > arr[nodeIndex]&&(nodeIndex * 2 + 1)<=end) {
                swap(arr, nodeIndex * 2 +1, nodeIndex);
            }
            /**
             * �����������бȽ�
             */
            if (arr[nodeIndex * 2 + 2] > arr[nodeIndex]&&(nodeIndex * 2 + 2)<=end) {
                swap(arr, nodeIndex * 2 + 2, nodeIndex);
            }
            nodeIndex--;
        }

    }
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        Integer [] arr=new Integer[]{9,8,5,6,8,9,1,2,4,3,10};
        sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}


