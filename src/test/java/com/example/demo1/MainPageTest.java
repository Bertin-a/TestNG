package com.example.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPageTest {
    public static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test(priority = 1, groups = "Title")
    public void googleTitle() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test(priority = 2, groups = "logo")
    public void googleLogoTest() {
        Boolean logo = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
        System.out.println(logo);

    }

    @Test(priority = 3, groups = "Link Test")
    public void mailLinkTest() {
        Boolean B = driver.findElement(By.linkText("Gmail")).isDisplayed();
        System.out.println(B);
    }

    @Test(priority = 6, groups = "Test")
    public void test1() {
        System.out.println("Test1");
    }

    @Test(priority = 5, groups = "Test")
    public void test2() {
        System.out.println("Test2");
    }

    @Test(priority = 4,groups = "Test")
    public void test3() {
        System.out.println("Test3");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}