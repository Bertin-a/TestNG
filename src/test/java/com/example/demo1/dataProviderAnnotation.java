package com.example.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class dataProviderAnnotation {
    public WebDriver driver;

    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://signup.ebay.com/pa/crte?usage=2943");
        driver.manage().window().maximize();
    }
    @DataProvider(name="userDetails")
    public Object[][]userDetails(){
        Object [][]data = new Object[3][4];
        data[0][0]="Bertina "; data[0][1]="Ayuure "; data[0][2]=" bert@gmail.com"; data[0][3]=" 123@Astore";
        data[1][0]="YT "; data[1][1]="htk "; data[1][2]="yt@gmail.com "; data[1][3]="123@Astore ";
        data[2][0]=" wrwfwef"; data[2][1]=" grevx"; data[2][2]="hty@gmail.com "; data[2][3]="123@Astore ";

        return data;

    }
    @Test(dataProvider = "userDetails")
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
