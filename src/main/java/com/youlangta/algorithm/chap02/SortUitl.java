package com.youlangta.algorithm.chap02;

public class SortUitl {

    public static <T extends Comparable<T>> void insertSort(T[] targetValues) {
        if (targetValues != null) {
            if (targetValues.length > 1) {
                for (int i = 1; i < targetValues.length; i++) {
                    T targetValue = targetValues[i];
                    int frontIndex = i - 1;
                    while (frontIndex >= 0 && targetValues[frontIndex].compareTo(targetValue) > 0) {
                        targetValues[frontIndex + 1] = targetValues[frontIndex];
                        frontIndex--;
                    }
                    targetValues[frontIndex + 1] = targetValue;
                }
            }
        }
    }

}
