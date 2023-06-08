package com.loop.test.practice.day3;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//1. navigate to docuport application
//2. validate placeholders for user name and password
//3. without sending username and password click login button
//4. validate username and password error messages

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_URL);

        //Validate username or email
        WebElement userNamePlaceHolder = driver.findElement(By.cssSelector("label[for='input-14']"));
        String actualNamePlaceHolder = userNamePlaceHolder.getText();

        if (actualNamePlaceHolder.equalsIgnoreCase(DocuportConstants.EXPECTED_PLACEHOLDER_USERNAME)){
            System.out.println("Expected username placeholder: " + DocuportConstants.EXPECTED_PLACEHOLDER_USERNAME + "actual matches UserName Place holder "+ actualNamePlaceHolder);
            System.out.println("Test Passed");
        }else {
            System.out.println("Expected username placeholder: " + DocuportConstants.EXPECTED_PLACEHOLDER_USERNAME + "actual does not matches UserName Place holder "+ actualNamePlaceHolder);
            System.out.println("Test Failed");
        }
        //Validate password

        WebElement passwordPlaceHolder = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPasswordPlaceHolder = passwordPlaceHolder.getText();

        if (actualPasswordPlaceHolder.equalsIgnoreCase(DocuportConstants.EXPECTED_PLACEHOLDER_PASSWORD)){
            System.out.println("Expected password placeholder: " + DocuportConstants.EXPECTED_PLACEHOLDER_PASSWORD + "actual matches password Place holder "+ actualPasswordPlaceHolder);
            System.out.println("Test Passed");
        }else {
            System.out.println("Expected password placeholder: " + DocuportConstants.EXPECTED_PLACEHOLDER_PASSWORD + "actual does not matches password Place holder "+ actualPasswordPlaceHolder);
            System.out.println("Test Failed");
        }

        //3. without sending username and password click login button

        WebElement login = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        login.click();

        //4. validate username and password error messages

        WebElement errorForUserName = driver.findElement(By.cssSelector("div[class='v-messages__message']"));
        String actualErrorUserName = errorForUserName.getText();

        if (actualErrorUserName.equals(DocuportConstants.EXPECTED_MESSAGE_FOR_USERNAME)){
            System.out.println("Expected Error for username: "+ DocuportConstants.EXPECTED_MESSAGE_FOR_USERNAME+ "matches with "+ actualErrorUserName);
            System.out.println("Test Passed");
        }else {
            System.out.println("Expected Error for username: "+ DocuportConstants.EXPECTED_MESSAGE_FOR_USERNAME + "does not match"+ actualErrorUserName);
            System.out.println("Test Failed");
        }

        WebElement errorForPassword = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[2]"));
        String actualErrorPassword = errorForPassword.getText();
        if (actualErrorPassword.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
           System.out.println("Expected Error for password: "+ DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD+ " matches with " + actualErrorPassword);
           System.out.print("Test ");
            System.err.println("Pass");
        }else {
            System.out.println("Expected Error for password: "+ DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + " does not match " + actualErrorPassword);
            System.err.println("Test Failed");
        }
        //Thread.sleep(1000);


    }
}
