package selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AssignTaskTest extends BaseTest {

    @Test
    public void assignTask(){

        driver.findElement(By.id("email"))
                .sendKeys("lead@test.com");

        driver.findElement(By.id("password"))
                .sendKeys("123");

        driver.findElement(By.tagName("button"))
                .click();

        driver.findElement(By.id("taskTitle"))
                .sendKeys("Selenium Test Task");

        driver.findElement(By.id("taskDesc"))
                .sendKeys("Testing task assignment");

        driver.findElement(By.id("assignBtn"))
                .click();

        System.out.println("Task Assigned Test Passed");

    }

}