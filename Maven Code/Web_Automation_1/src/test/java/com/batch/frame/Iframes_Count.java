package com.batch.frame;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Iframes_Count {

    WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @Test
    public void openURL() throws InterruptedException {
        this.driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
        Thread.sleep(5000);

        driver.switchTo().frame("Iframe 1");


       // WebElement element = driver.findElement(By.xpath("//a[title='\back to Selenium Tutorial']"));
        //Actions action = new Actions(driver);
        //action.moveToElement(element).perform();
       // Thread.sleep(5000);

        WebElement element = driver.findElement(By.name("external-link"));
        element.click();
        Thread.sleep(5000);

    }

    @AfterSuite
    public void closeChromeBrowser() {
        this.driver.close();
    }
}