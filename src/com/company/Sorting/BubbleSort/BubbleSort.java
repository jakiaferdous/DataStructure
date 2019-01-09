package com.company;

public class BuubleSort {


    private static void bubbleSort(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                }
            }
            for (int x : array) {
                System.out.print(x + " ");
            }
            System.out.println();

        }

    }

    private static void swap(int a, int b, int[] array) {

        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;

    }

    public static void main(String[] args) {

        int[] array = new int[]{5, 8, 1, 6, 9, 2};
        bubbleSort(array);
    }


}
