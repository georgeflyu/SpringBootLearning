package com.gjh.elasticsearchDemo.AlgorithmDemo.sort;

public class SelectSort {

    public static void sort(Comparable[] sortArray) {
        for (int i = 0; i < sortArray.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= sortArray.length - 1; j++) {
                minIndex = compare(sortArray[j], sortArray[minIndex]) ? j : minIndex;
            }
            exchange(sortArray, minIndex, i);
        }

    }

    public static boolean compare(Comparable c1, Comparable c2) {
        return c1.compareTo(c2) > 0;
    }

    public static void exchange(Comparable[] sortArray, int i, int j) {
        Comparable temp = sortArray[i];
        sortArray[i] = sortArray[j];
        sortArray[j] = temp;
    }
}
