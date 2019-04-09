package com.hackerrank.ipk.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void test1(){
        int a[] = {1,2,3,4,5};
        int expected[] = {3,4,5,1,2};
        int[] result = LeftRotation.rotLeft(a,2);
        Assert.assertArrayEquals(expected,result);
        /*for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + ",");
        }*/
    }

    @Test
    public void test2(){
        int a[] = {1,2,3,4,5};
        int expected[] = {3,4,5,1,2};
        int[] result = LeftRotation.rotLeft(a,7);
        Assert.assertArrayEquals(expected,result);
        /*for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + ",");
        }*/
    }
}