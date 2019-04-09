package com.hackerrank.ipk.arrays;

import java.util.Arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        if(d > a.length) {
            d = d % a.length;
        }

        int[] result = new int[a.length];
        System.arraycopy(a,d, result, 0, a.length-d);
        System.arraycopy(a,0, result, a.length-d, d);

        return result;
    }
}
