package com.loop.test.practice.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
//1. Open Chrome browser
//2. Go to https://www.etsy.com
//3. Search for “wooden spoon”
//4. Verify title:
//Expected: “Wooden spoon | Etsy”

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        WebElement searchBoxWithName = driver.findElement(By.name("search_query"));
        String textToSearch = "wooden spoon";
        searchBoxWithName.click();
        searchBoxWithName.sendKeys(textToSearch + Keys.ENTER);

        String expectedTitle = "wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ", =. PASS");
        } else {
            System.err.println("Actual title: " + actualTitle + ", does not match expected title: " + expectedTitle + ", =. FAIL");
        }




    }
}
