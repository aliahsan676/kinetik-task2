package com.kinetik.task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcomTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();


        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.quit();
    }

}
