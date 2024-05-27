package com.opencart;

import com.opencart.managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getInstance().getDriver();

        String currentTabName = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-safari-driver/4.20.0");
        Thread.sleep (5000);
        driver.close();

        driver.switchTo().window(currentTabName);
        driver.get("https://tekwillacademy-opencart.online/");
        Thread.sleep (5000);
        driver.quit();


        System.out.println("The test is finished and the driver is closed");




    }
}