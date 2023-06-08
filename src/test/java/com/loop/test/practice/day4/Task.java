package com.loop.test.practice.day4;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task {
    @Test
    public void docuportTest () throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_URL);

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        WebElement password = driver.findElement(By.id("input-15"));

        password.sendKeys(DocuportConstants.PASSWORD_All);
        WebElement login = driver.findElement(By.className("v-btn__content"));
        login.click();

        Thread.sleep(3000);

        //3.store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
        List<WebElement> leftItems = driver.findElements(By.xpath("//a[contains(@class,'v-list-item')]"));
        System.out.println("leftItems= " + leftItems.size());
        Thread.sleep(3000);

        //  4. iterate and print out href values
        for (WebElement each : leftItems) {
            if (!each.getText().equals("")){
                System.out.println("leftItems= " + each.getText());
                System.out.println("leftItems= " + each.getAttribute("href"));   //href is always link
            }
        }

        // 5. Validate that expected matching to actual
        Thread.sleep(3000);

        System.out.println("TestNG is running");
        String [] expected = {"Home", "Received docs", "My uploads", "Clients", "Invitations", "Users", "Leads", "Bookkeeping", "1099 Form", "Reconciliations"};
        String [] actual = new String[leftItems.size()];

        for (int i = 0; i < leftItems.size(); i++) {
            actual[i] = leftItems.get(i).getText();
        }
        Assert.assertEquals(actual, expected);




    }

}

