package com.kinetik.task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class EcomTest {
    public static void main(String[] args) throws InterruptedException {

        // 1. Launch browser(Chrome/Firefox)

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // 2. Navigate to url 'http://automationexercise.com'

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
        // Adding the delay for observing the output properly
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
        String expectedText = "Shopping Cart";
        String pageSource = driver.getPageSource();
        if (pageSource.contains(expectedText)) {
            System.out.println("Cart page is visible successfully.");
        } else {
            System.out.println("Cart page is not visible.");
        }


        // 7. Click Proceed To Checkout

        driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a")).click();


        //8. Click 'Register / Login' button

        driver.findElement(By.xpath("/html/body/section/div/section/div[2]/div/div/div[2]/p[2]/a/u")).click();


        // 9. Fill all details in Sign up and create account

        WebElement webElement1 = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
        webElement1.clear();
        webElement1.sendKeys("Ali Ahsan");
        // Adding the delay for observing the output properly
        Thread.sleep(3000);

        WebElement webElement2 = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
        webElement2.clear();
        webElement2.sendKeys("ali@ahsan.com");
        // Adding the delay for observing the output properly
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();

        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        webElement3.clear();
        webElement3.sendKeys("12345qwert");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"uniform-days\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/div/div[1]/div/select/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/div/div[2]/div/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/div/div[3]/div/select/option[28]")).click();

        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
        webElement4.clear();
        webElement4.sendKeys("Ali");
        Thread.sleep(3000);

        WebElement webElement5 = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
        webElement5.clear();
        webElement5.sendKeys("Ahsan");
        Thread.sleep(3000);

        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        webElement6.clear();
        webElement6.sendKeys("14 Bronx, NY - 1200");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/p[6]/select/option[2]")).click();


        WebElement webElement7 = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        webElement7.clear();
        webElement7.sendKeys("NewYork");
        Thread.sleep(3000);

        WebElement webElement8 = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        webElement8.clear();
        webElement8.sendKeys("Bronx");
        Thread.sleep(3000);

        WebElement webElement9 = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
        webElement9.clear();
        webElement9.sendKeys("1200");
        Thread.sleep(3000);

        WebElement webElement10 = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
        webElement10.clear();
        webElement10.sendKeys("01201299012");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/button")).click();


        // 10. Verify 'ACCOUNT CREATED!' and click 'Continue' button

        String expectedText2 = "Your new account has been successfully created";
        String pageSource2 = driver.getPageSource();
        if (pageSource2.contains(expectedText2)) {
            System.out.println("Account Created successfully.");
        } else {
            System.out.println("Account Creation Failed.");
        }

        driver.findElement(By.xpath("/html/body/section/div/div/div/div/a")).click();

        // 11. Verify ' Logged in as username' at top

        String expectedText3 = "Logged in as Ali Ahsan";
        String pageSource3 = driver.getPageSource();
        if (pageSource3.contains(expectedText3)) {
            System.out.println("Logged in as given Username.");
        } else {
            System.out.println("Logged in as Other name.");
        }

        // 12. Click 'Cart' button

        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();

        // 13. Click 'Proceed To Checkout' button

        driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a")).click();

        // 14. Verify Address Details and Review Your Order

        String expectedText4 = "14 Bronx, NY - 1200";
        String pageSource4 = driver.getPageSource();
        if (pageSource4.contains(expectedText4)) {
            System.out.println("Address details is correct.");
        } else {
            System.out.println("Address details is not correct.");
        }

        String expectedText5 = "1100";
        String pageSource5 = driver.getPageSource();
        if (pageSource5.contains(expectedText5)) {
            System.out.println("Order details is correct.");
        } else {
            System.out.println("Order details is not correct.");
        }

        // 15. Enter description in comment text area and click 'Place Order'

        WebElement webElement11 = driver.findElement(By.xpath("/html/body/section/div/div[6]/textarea"));
        webElement11.clear();
        webElement11.sendKeys("Process Fast");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/section/div/div[7]/a")).click();

        // 16. Enter payment details: Name on Card, Card Number, CVC, Expiration date

        WebElement webElement12 = driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[1]/div/input"));
        webElement12.clear();
        webElement12.sendKeys("Ali Ahsan");
        Thread.sleep(3000);

        WebElement webElement13 = driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[2]/div/input"));
        webElement13.clear();
        webElement13.sendKeys("4242424242424242");
        Thread.sleep(3000);

        WebElement webElement14 = driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[1]/input"));
        webElement14.clear();
        webElement14.sendKeys("315");
        Thread.sleep(3000);

        WebElement webElement15 = driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[2]/input"));
        webElement15.clear();
        webElement15.sendKeys("02");
        Thread.sleep(3000);

        WebElement webElement16 = driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[3]/input"));
        webElement16.clear();
        webElement16.sendKeys("2026");
        Thread.sleep(3000);

        // 17. Click 'Pay and Confirm Order' button

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(3000);

        // 18. Verify the success message 'Your order has been placed successfully!'

        String expectedText6 = "Your order has been confirmed";
        String pageSource6 = driver.getPageSource();
        if (pageSource6.contains(expectedText6)) {
            System.out.println("Your order has been placed successfully!.");
        } else {
            System.out.println("Your order has been cancelled.");
        }

        //Thread.sleep(6000);

        driver.quit();
    }

}
