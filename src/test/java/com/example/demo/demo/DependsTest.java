package com.example.demo.demo;

import org.testng.annotations.Test;

public class DependsTest {

    @Test
    public void registrationTest()
    {
        System.out.println("Registration was Successful");
    }

    @Test(dependsOnMethods = {"registrationTest"})
    public void bookVilaTest()
    {
        System.out.println("Book Vila was Successful");
    }

}
