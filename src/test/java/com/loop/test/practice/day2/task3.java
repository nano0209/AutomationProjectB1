package com.loop.test.practice.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Open Docuport app
//2. Send UserName
//3. Send password
//4. Click login

public class task3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app/");
        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys("b1g1_supervisor@gmail.com");
        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys("Group1");
        WebElement login = driver.findElement(By.className("v-btn__content"));
        login.click();





    }
    }