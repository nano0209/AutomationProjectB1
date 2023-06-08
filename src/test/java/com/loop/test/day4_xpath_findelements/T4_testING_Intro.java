package com.loop.test.day4_xpath_findelements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_testING_Intro {
    @Test
    public void test1(){
        System.out.println("TestNG is running");
        String actual = "Feyruz";
        String expected = "Feyruz";

        Assert.assertEquals(actual, expected);
    }
}
