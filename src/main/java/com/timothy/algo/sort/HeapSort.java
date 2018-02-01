package com.timothy.algo.sort;

class HeapSort {
    public static void main(String[] args) {
        System.out.println("start!");
        int[] sortArray = {1, 5, 6, 88, 18, 2, 7};
        int length = sortArray.length;
        BuildHeap(sortArray);

        swap(0, length -1, sortArray);

        for (int i = 0; i < length; length --) {
            AdjustSort(0, length, sortArray);
        }

        for(;length < sortArray.length;length ++) {
            System.out.print(sortArray[length] + " -> ");
        }
    }

    public static void BuildHeap(int[] array) {
        int length = array.length;
        int index = length / 2 - 1;
        for(; index >= 0; index --) {
            AdjustSort(index, length, array);
        }
    }

    public static void AdjustSort(int index, int length, int[] array){

        int max = array[index];
        int largest = index;
        int leftNode = 2 * index + 1;
        int rightNode = leftNode + 1;

        if (leftNode < length && array[leftNode] > max) {
            largest = leftNode;
        } 
        
        if (rightNode < length && array[rightNode]> max ) {
            largest = rightNode;
        }

        if(largest != index ) {
            swap(index, largest, array);
            AdjustSort(largest, length, array);
        }
    }

    public static void swap(int from, int to, int[]array) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}