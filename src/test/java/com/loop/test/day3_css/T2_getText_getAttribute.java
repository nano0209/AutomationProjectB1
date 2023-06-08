package com.loop.test.day3_css;

import com.loop.test.utilities.DemoQaConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    /*
/*
     * go to url: https://demoqa.com/automation-practice-form
     * verify header text expected
     * verify placeholder attribute value is expected
     */
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement headerForForm = driver.findElement(By.tagName("h5"));

        String actualHeaderForForm = driver.findElement(By.tagName("h5")).getText();

        if (actualHeaderForForm.equals(DemoQaConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header for form: " + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + ", matches actual error message: " + actualHeaderForForm + ". Test PASSED");
        } else {
            System.out.println("Expected header for form: " + DemoQaConstants.EXPECTED_HEADER_FOR_FORM+ ", DOES NOT match actual error message: " + actualHeaderForForm + ". Test FAILED");
        }

        //get placeholder

        WebElement firstNamePlaceHolder = driver.findElement(By.id("firstName"));
        String actualPlaceHolderFirstName = firstNamePlaceHolder.getAttribute("placeholder");


        if (actualPlaceHolderFirstName.equals(DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME)){
            System.out.println("Expected placeholder: " + DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME + ", matches actual error message: " + actualPlaceHolderFirstName + ". Test PASSED");
        } else {
            System.out.println("Expected placeholder: " + DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME+ ", DOES NOT match actual error message: " + actualPlaceHolderFirstName + ". Test FAILED");
        }


        driver.quit();


    }
}
