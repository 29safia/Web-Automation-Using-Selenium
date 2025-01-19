package com.batch.windowTab;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Switch_To_Windows {

    WebDriver driver;
@BeforeSuite
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    driver.manage().window().maximize();

    }
@Test(priority = 0)
    public void openURL( ) throws InterruptedException {
        driver.get("https://mvnrepository.com/");
        Thread.sleep(7000);


    }

    @Test(priority = 1)
    public void switchingWindows() throws InterruptedException {
    //first way of switching window

    //String parentTab = driver.getWindowHandle();

    //new tab
   // driver.switchTo().newWindow(WindowType.TAB);
     //String childTab = driver.getWindowHandle();
     //driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
     //Thread.sleep(5000);

     //driver.switchTo().window(parentTab);
     //Thread.sleep(5000);
     //driver.switchTo().window(childTab);
     //Thread.sleep(5000);

        //2nd way of switching window

        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        windows.add(driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        windows.add(driver.getWindowHandle());
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(5000);

        driver.switchTo().window(windows.get(0));
        Thread.sleep(5000);
        driver.switchTo().window(windows.get(1));
        Thread.sleep(5000);
        driver.switchTo().window(windows.get(2));
        Thread.sleep(5000);

    }

@AfterSuite
    public void closeChromeBrowser() {
        driver.quit();

    }
}
