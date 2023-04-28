package com.example.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGFeatures {
    public WebDriver driver;
    @BeforeMethod
    public void visit(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void Login(){
        System.out.println("Login");
       // int i=9/0;
    }
    @Test(dependsOnMethods = "Login",invocationCount =2)
    public void Homepage(){
        System.out.println("Homepage");
    }
    @Test(timeOut = 2000,expectedExceptions = NumberFormatException.class)
    public void infinityLoopCount(){
        int i=1;
                while(i==1)
                    System.out.println(i);
    }
    @Test(expectedExceptions = NumberFormatException.class)
    public void test(){
        String x="100A";
        Integer.parseInt(x);
    }
    @Test
    public void googleTest(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Google","title is not matched");


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
