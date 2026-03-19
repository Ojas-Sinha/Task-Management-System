package com.example.taskmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach	;
import org.junit.jupiter.api.BeforeEach;	
public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setup(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://localhost:30007/login.html");
    }

    @AfterEach
    public void tearDown(){

        if(driver != null){
            driver.quit();
        }

    }

}