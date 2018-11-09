package com.vens.sort;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/11/9
 */
public class MergeSort {
    /**
     * 思路:就是将数组分而治之
     * 时间复杂度：O(n*log(n))
     * 稳定性：在交换元素时候，可以不交换，所以可以是稳定的
     * @param arr
     * @param start
     * @param end
     * @param temp
     */
    public static void sort(int[] arr, int start, int end, int[] temp) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid, temp);
        sort(arr, mid + 1, end, temp);
        merge(arr, mid, start, end, temp);
    }

    public static void merge(int[] arr, int mid, int start, int end, int[] temp) {
        int left = start;
        int index = 0;
        int pos = mid+1;
        while (left <= mid && pos <= end) {
            if (arr[left] <= arr[pos]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[pos++];
            }
        }
        while (left <= mid) {
            temp[index++] = arr[left++];
        }
        while (pos <= end) {
            temp[index++] = arr[pos++];
        }
        System.arraycopy(temp, 0, arr, start, end - start+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 5, 6, 8, 9, 1, 2, 4, 3, 10};
        int len = arr.length - 1;
        int[] temp = new int[12];
        sort(arr, 0, len, temp);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
