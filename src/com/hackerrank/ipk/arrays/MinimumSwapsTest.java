package com.hackerrank.ipk.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwapsTest {

    @Test
    public void minimumSwaps1() {
        int input[] = {2,3, 4, 1, 5};
        Assert.assertEquals(3,MinimumSwaps.minimumSwaps(input));
    }

    @Test
    public void minimumSwaps2() {
        int input[] = {1, 3, 5, 2, 4, 6, 7};
        Assert.assertEquals(3,MinimumSwaps.minimumSwaps(input));
    }

    @Test
    public void minimumSwaps3() {
        int input[] = {4, 3, 1, 2};
        Assert.assertEquals(3,MinimumSwaps.minimumSwaps(input));
    }
}