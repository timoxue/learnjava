package com.timothy.algo.sort;

class QuickSort {
    public static int[] quickSort = {1, 6, 2, 16, 32, 33, 3, 6, 62, 24, 13};

    public static void main(String[] args) {
        sort(0, quickSort.length - 1, quickSort);
        for(int i = 0; i < quickSort.length; i ++) {
            System.out.println(quickSort[i]);
        }
    }

    public static void sort(int start, int end, int[] array) {
        int i = start, j = end;
        int pivot = array[(end - start) /2 + start];
        while(i <= j) {
            while(array[i] < pivot) {
                i ++;
            }

            while(array[j] > pivot) {
                j --;
            }

            if(i <= j) {
                swap(i, j);
                i ++;
                j --;
            }
        }

        if(i < end) {
            sort(i, end, array);
        }
        if(j > start) {
            sort(start, j, array);
        }

    }

    public static void swap(int i, int j) {
        int temp = quickSort[i];
        quickSort[i] = quickSort[j];
        quickSort[j] = temp;
    }
}