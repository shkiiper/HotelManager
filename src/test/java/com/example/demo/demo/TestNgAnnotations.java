package com.example.demo.demo;

import org.testng.annotations.BeforeSuite;

import java.awt.*;

public class TestNgAnnotations {
    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("beforesuite");
    }
}
