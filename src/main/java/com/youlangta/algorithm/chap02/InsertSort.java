package com.youlangta.algorithm.chap02;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertSort {


    public static void main(String[] args) {
        Integer[] values = new Integer[]{5, 2, 4, 6, 1, 3};
        System.out.println(new ArrayList<>(Arrays.asList(values)));
        SortUitl.insertSort(values);
        System.out.println(new ArrayList<>(Arrays.asList(values)));
    }

}
