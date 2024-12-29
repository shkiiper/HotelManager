package com.example.demo.demo;

import com.github.javafaker.Faker;

public class FakeFactory {

    Faker faker = new Faker();

    public String generateFakeName(){
        return faker.name().fullName();
    }

    public String generateFakePassword(){
        return faker.internet().password();
    }
}
