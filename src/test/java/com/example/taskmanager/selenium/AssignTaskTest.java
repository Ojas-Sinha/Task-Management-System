package selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AssignTaskTest extends BaseTest {

    @Test
    public void assignTask(){

        // Login as Team Lead
        driver.findElement(By.id("email"))
                .sendKeys("lead@test.com");

        driver.findElement(By.id("password"))
                .sendKeys("123");

        driver.findElement(By.tagName("button"))
                .click();

        // Enter task title
        driver.findElement(By.id("taskTitle"))
                .sendKeys("Selenium Automation Task");

        // Enter description
        driver.findElement(By.id("taskDesc"))
                .sendKeys("Testing task assignment with Selenium");

        // Select member (checkbox example)
        driver.findElement(By.xpath("//input[@value='2']")).click();

        // Click Assign button
        driver.findElement(By.id("assignBtn")).click();

        System.out.println("Assign Task Test Passed");

    }

}