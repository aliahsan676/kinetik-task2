package com.kinetik.task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcomTest {
    public static void main(String[] args) throws InterruptedException {

        // 1. Launch browser(Chrome/Firefox)

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // 2. Navigate to url 'http://automationexercise.com'

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

        // 3. Verify that home page is visible successfully

        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Home page is visible successfully.");
        } else {
            System.out.println("Home page is not visible.");
        }

        // Step 4: Add products to cart
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[6]/div/div[2]/ul/li/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[3]/button")).click();
        Thread.sleep(3000);

        //5. Click 'Cart' button
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();


        //6. Verify that cart page is displayed
        String expectedTitle1 = "Shopping Cart";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("Cart page is visible successfully.");
        } else {
            System.out.println("Cart page is not visible.");
        }








        //System.out.println(driver.getTitle());
        Thread.sleep(6000);

        driver.quit();
    }

}
