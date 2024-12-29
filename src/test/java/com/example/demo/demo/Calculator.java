package com.example.demo.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator extends TestNgAnnotations{

    public int add (int a, int b)
    {
        return a+b;
    }
    public int subtrackt (int a, int b)
    {
        return a-b;
    }
    public int multiply (int a, int b)
    {
        return a*b;
    }
    public int divide (int a, int b)
    {
        if (b==0)
        {
            throw new ArithmeticException("Деление на ноль не допустимо");
        }
        return a/b;
    }

    @Test
    void testAdd()
    {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(10,2), 12);
    }

    @Test
    void testSubtrackt()
    {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtrackt(2,1), 1);
    }

    @Test
    void testMultiply()
    {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(1,2), 2);
    }

    @Test (expectedExceptions = ArithmeticException.class)
    void testDivide()
    {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(0,5), 1);
    }
}
