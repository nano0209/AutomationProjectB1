package com.loop.test.practice.day2;
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Click to Gmail from top right.
//4- Verify title contains:
//Expected: Gmail
//5- Go back to Google by using the .back();
//6- Verify title equals:
//Expected: Google

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement aboutLink = driver.findElement(By.linkText("Gmail"));
        aboutLink.click();
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ", =. PASS");
        } else {
            System.err.println("Actual title: " + actualTitle + ", does not match expected title: " + expectedTitle + ", =. FAIL");
        }
        driver.navigate().back();
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle2 + ", matches expected title: " + expectedTitle + ", =. PASS");
        } else {
            System.err.println("Actual title: " + actualTitle2 + ", do not match expected title: " + expectedTitle + ", =. FAIL");
        }
    }
}