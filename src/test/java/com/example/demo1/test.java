package com.example.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.Debug;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class test {
    //public WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
        System.out.println("Before method 1");
       //Assert.assertEquals(true,false, "test failed");
        System.out.println(" this is the next test under my before block");
    }

    @Test
    public void login(){
        System.out.println("User was able to log in");
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(false,true, "passed");
        System.out.println("This is under a failed test");
        soft.assertAll();
    }
    @Test
    public void logout(){
        System.out.println("User is logged out");

    }





}
