package com.example.demo.demo;

import org.testng.annotations.Test;

public class GroupsTests {

    @Test(groups = "UI")
    public void testGroups1()
    {
        System.out.println("testGroups1");
    }

    @Test(groups = "DB")
    public void testGroups2()
    {
        System.out.println("testGroups2");
    }

    @Test(groups = "UI")
    public void testGroups3()
    {
        System.out.println("testGroups3");
    }

    @Test(groups = "API", enabled = false)
    public void testGroups4()
    {
        System.out.println("testGroups4");
    }
}
