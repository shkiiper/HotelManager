package com.example.demo.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTests {

    @Test
    @Parameters("browser")
    public void test1(String browser)
    {
        System.out.println("Running test "+ browser);
    }
}
