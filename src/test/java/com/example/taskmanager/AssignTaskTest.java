package com.example.taskmanager;

import org.openqa.selenium.By;
import org.junit.jupiter.api.Test;

public class AssignTaskTest extends BaseTest {

    @Test
    public void assignTask() throws Exception {

        // Open login page
        driver.get("http://localhost:30007/login.html");

        // Login as Team Lead
        driver.findElement(By.id("email"))
                .sendKeys("lead@test.com");

        driver.findElement(By.id("password"))
                .sendKeys("123");

        driver.findElement(By.tagName("button"))
                .click();

        // wait for dashboard to load
        Thread.sleep(3000);

        // Enter task title
        driver.findElement(By.id("title"))
                .sendKeys("Selenium Automation Task");

        // Enter description
        driver.findElement(By.id("desc"))
                .sendKeys("Testing task assignment with Selenium");

        // Select first member
        driver.findElement(By.cssSelector("#memberList input[type='checkbox']"))
                .click();

        // Click assign button
        driver.findElement(By.xpath("//button[text()='Assign Task']"))
                .click();

        Thread.sleep(2000);

        System.out.println("Assign Task Test Passed");
    }
}