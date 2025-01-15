package com.batch.select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Select_By_Index {

    WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @Test
    public void openURL() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
        Thread.sleep(5000);

        WebElement dropdown = driver.findElement(By.id("inputGroupSelect03"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        Thread.sleep(5000);

    }

    @AfterSuite
    public void closeChromeBrowser() {
        this.driver.close();
    }
}
