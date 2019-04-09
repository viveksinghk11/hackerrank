package com.hackerrank.ipk;

import org.junit.Assert;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @org.junit.Test
    public void repeatedString1() {
        Assert.assertEquals(7,RepeatedString.repeatedString("aba",10));
    }

    @org.junit.Test
    public void repeatedString2() {
        Assert.assertEquals(41107102139L,RepeatedString.repeatedString(
                "ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt",685118368975L));
    }

    @org.junit.Test
    public void repeatedString3() {
        Assert.assertEquals(534802106762L,RepeatedString.repeatedString(
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",534802106762L));
    }
}