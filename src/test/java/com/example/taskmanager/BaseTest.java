package com.example.taskmanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected WebDriver driver;

    
    @BeforeEach
    public void setup(){
    
        WebDriverManager.chromedriver().setup();
    
        ChromeOptions options = new ChromeOptions();
    
        options.addArguments("--headless");          // important for Jenkins
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
    
        // 🔥 VERY IMPORTANT (your actual Chrome path)
        options.setBinary("C:\\Users\\nitin\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
    
        driver = new ChromeDriver(options);
    
        driver.manage().window().maximize();
    
        driver.get("http://localhost:8081/login.html");
    }

    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
