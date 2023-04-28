package com.example.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderAnnotation {
    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://signup.ebay.com/pa/crte?usage=2943");
        driver.manage().window().maximize();
    }
//    @DataProvider(name="userDetails")
//    public Object[][]userDetails(){
//        return new Object[][]{
//
//
//        }
//
//    }
    @Test
    public void site(String firstname, String lastname, String email, String password){
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

}
