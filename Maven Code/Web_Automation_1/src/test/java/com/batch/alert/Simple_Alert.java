package com.batch.alert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Simple_Alert {

    WebDriver driver;
@BeforeSuite
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    driver.manage().window().maximize();

    }
@Test(priority=0)
    public void openURL( ) throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        Thread.sleep(7000);

    }

    @Test(priority=1)
    public void acceptAlert() throws InterruptedException {
    WebElement alert_element = driver.findElement(By.xpath("//button[@onclick='showAlert()']"));
    alert_element.click();
    Thread.sleep(3000);

    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();
    }
@AfterSuite
    public void closeChromeBrowser() {
        driver.close();

    }
}