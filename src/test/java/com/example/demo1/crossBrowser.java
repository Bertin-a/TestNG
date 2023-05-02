package com.example.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser {

    public WebDriver driver;

    @Parameters({"url","BrowserType"})
    @Test
    public void setup( String url, String BrowserType){

        if (BrowserType.equalsIgnoreCase("Internet Explorer")){
            driver= new EdgeDriver();
            WebDriverManager.edgedriver().setup();


        }
        else if (BrowserType.equalsIgnoreCase("Chrome")){

            driver= new ChromeDriver();
            WebDriverManager.chromedriver().setup();
        }
        else if (BrowserType.equalsIgnoreCase("Firefox")){

            driver= new FirefoxDriver();
            WebDriverManager.firefoxdriver().setup();
        }

        driver.get(url);
        driver.manage().window().maximize();
    }
}
