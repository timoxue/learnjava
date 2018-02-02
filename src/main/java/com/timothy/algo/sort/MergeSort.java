package com.timothy.algo.sort;

class MergeSort {
    public static void main(String[] args) {
        int mergeArray[] = {1, 4, 3, 6 ,7, 2, 15,22,19,33,22,44,16,64,2,3, 12};
        mergeArray = iterationMerge(mergeArray);

        for(int i = 0; i < mergeArray.length; i ++) {
            System.out.println(mergeArray[i]);
        }
    }


    public static int[] iterationMerge(int[] array){
        int result[] = new int[array.length];
        int length = array.length;
        for(int block = 1; block < length; block *= 2 ) {
            for(int i = 0; i < length; i += block * 2) {
                int low = i;
                int mid = i + block -1;
                int high = i + 2 * block -1;

                int start1 = low;
                int end1 = length > mid ? mid : length -1;
                int start2 = mid +1;
                int end2 = length > high ? high : length -1;
                
                while(start1 <= end1 && start2 <= end2) {
                    result[low++] = array[start1] > array[start2] ? array[start1++] : array[start2++];
                }
                while(start1 <= end1) {
                    result[low++] = array[start1++];
                }
                while(start2 <= end2) {
                    result[low++] = array[start2++];
                }
            }
            int[] temp = array;
            array = result;
            result = temp;
        }
        return array;
    }
}