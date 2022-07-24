package com.gjh.elasticsearchDemo.AlgorithmDemo.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectSortTest {

    @Test
    void sort() {
        Integer[] arr = new Integer[]{12, 56, 0, 78, 2, 46, 35};
        SelectSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}