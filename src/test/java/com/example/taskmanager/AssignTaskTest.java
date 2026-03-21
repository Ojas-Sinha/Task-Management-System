package com.example.taskmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;   // ✅ FIXED

import org.junit.jupiter.api.Test;

public class AssignTaskTest extends BaseTest {

    @Test
    public void assignTask() throws Exception {

        driver.get("http://localhost:8081/login.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // LOGIN
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
                .sendKeys("lead@test.com");

        driver.findElement(By.id("password"))
                .sendKeys("123");

        driver.findElement(By.tagName("button"))
                .click();

        // WAIT for dashboard
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));

        // ENTER TITLE
        WebElement title = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("title"))
        );
        title.sendKeys("Selenium Automation Task");

        // ENTER DESCRIPTION
        driver.findElement(By.id("desc"))
                .sendKeys("Testing task assignment with Selenium");

        // WAIT for members (AJAX)
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("#memberList input"), 0
        ));

        // SELECT MEMBER
        driver.findElement(By.cssSelector("#memberList input"))
                .click();

        // CLICK ASSIGN BUTTON
        driver.findElement(By.xpath("//button[text()='Assign Task']"))
                .click();

        // WAIT FOR SUCCESS MESSAGE
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taskMessage")));

        System.out.println("✅ Assign Task Test Passed");
    }
}