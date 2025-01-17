package com.batch.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class Locate_By_TagName {

    WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @Test
    public void openURL() throws InterruptedException {
        this.driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        Thread.sleep(5000);

       List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }
        Thread.sleep(5000);
    }

    @AfterSuite
    public void closeChromeBrowser() {
        this.driver.close();
    }
}
