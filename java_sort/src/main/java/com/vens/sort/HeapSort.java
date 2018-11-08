package com.vens.sort;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/11/6
 */
public class HeapSort {

    /**
     * 思路：将排序序列构成一个大根堆，然后将root和堆尾元素（第n个）进行交换，然后再将出去堆尾的n-1个元素调整为大根堆，再与末尾元素（第n-1）交换，如此反复执行n-1次。
     * 步骤：
     * 1.构建初始堆，就是要将待排序序列构成一个大根堆
     * 2.交换元素
     * 3.调整堆
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
             * 与左子树进行比较
             */
            if (arr[nodeIndex * 2 + 1] > arr[nodeIndex]&&(nodeIndex * 2 + 1)<=end) {
                swap(arr, nodeIndex * 2 +1, nodeIndex);
            }
            /**
             * 与右子树进行比较
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


