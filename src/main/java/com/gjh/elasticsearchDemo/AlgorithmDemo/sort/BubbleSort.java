package com.gjh.elasticsearchDemo.AlgorithmDemo.sort;

public class BubbleSort {

    public static void sort(Comparable[] sortArray) {
        for (int j = sortArray.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (compare(sortArray[i], sortArray[i + 1])) {
                    exchange(sortArray, i, i + 1);
                }
            }
        }
    }

    public static boolean compare(Comparable o1, Comparable o2) {
        return o1.compareTo(o2) > 0;
    }

    public static void exchange(Comparable[] sortArray, int i, int j) {
        Comparable temp = sortArray[i];
        sortArray[i] = sortArray[j];
        sortArray[j] = temp;
    }
}
