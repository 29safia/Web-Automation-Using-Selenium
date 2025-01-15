package com.batch.mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Hover_Example {

    WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @Test
    public void openURL() throws InterruptedException {
        this.driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(5000);


        WebElement element = driver.findElement(By.xpath("//a[@title='Women']"));
       Actions action = new Actions(driver);
       action.moveToElement(element).perform();
       Thread.sleep(5000);

       WebElement dress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
       dress.click();

    }

    @AfterSuite
    public void closeChromeBrowser() {
        this.driver.close();
    }
}
