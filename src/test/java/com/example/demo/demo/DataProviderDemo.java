package com.example.demo.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    FakeFactory fakeFactory = new FakeFactory();

    @DataProvider(name = "user credentials")
    public Object[][] userCredentials() {
        return new Object[][]{
                {"admin", "admin"},
                {"password", "password"},
                {"password2", "password2"},
                {"user", "user"},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword()},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword()},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword()},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword()},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword()}
        };
    }

    @Test(dataProvider = "user credentials")
    public void testLogin1(String username, String password)
    {
        System.out.println("Input username and password "+ username +" "+password);
    }

}