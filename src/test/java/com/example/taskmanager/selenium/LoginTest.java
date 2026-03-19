package selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

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