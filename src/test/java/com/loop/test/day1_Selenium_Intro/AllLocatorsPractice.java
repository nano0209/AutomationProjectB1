package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // create driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google page
        driver.get("https://demoqa.com/automation-practice-form/");

        // maximize the window
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys();

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys();


        WebElement gender = driver.findElement(By.name("Gender"));
        gender.click();



        firstName.sendKeys();



    }
}
