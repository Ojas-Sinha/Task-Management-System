package com.example.taskmanager;

import org.openqa.selenium.By;
import org.junit.jupiter.api.Test;

public class MemberTaskViewTest extends BaseTest {

    @Test
    public void memberViewTask(){

        driver.findElement(By.id("email"))
                .sendKeys("member1@test.com");

        driver.findElement(By.id("password"))
                .sendKeys("123");

        driver.findElement(By.tagName("button"))
                .click();

        System.out.println("Member Dashboard Loaded");

    }

}