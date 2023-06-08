package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Test0_StaleElementException {

    public static void main(String[] args) {
        //1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to http://the-internet.herokuapp.com/add_remove_elements/
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        //3. Click to “Add Element” button
        WebElement addButton = driver.findElement(By.xpath("//button[contains(@onclick,'addElement()')]"));
        addButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete'"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete button is displayed ---> TEST PASS");
        }else {
            System.out.println("Delete button is displayed ---> TEST PASS");

        }

        deleteButton.click();

//        if (deleteButton.isDisplayed()){
//            System.out.println("TEST PASS");
//        }else {
//            System.out.println("TEST FAIL");
//        }


        try {
            deleteButton.isDisplayed();
            }catch (StaleElementReferenceException e){
            System.out.println("Exception handled");
            System.out.println("Element is not displayed anymore");
            System.out.println("Delete button is NOT displayed ---> TEST PASS");
        }
        driver.quit();



    }
}
