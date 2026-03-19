package com.example.taskmanager;

import org.openqa.selenium.By;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginAsLead(){

        driver.findElement(By.id("email"))
                .sendKeys("lead@test.com");

        driver.findElement(By.id("password"))
                .sendKeys("123");

        driver.findElement(By.tagName("button"))
                .click();

        System.out.println("Login Test Passed");

    }

}