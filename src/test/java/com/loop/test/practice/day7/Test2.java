package com.loop.test.practice.day7;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends TestBase {

    @Test(priority = 2)
    public void web_test1(){
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_GROUP1_SUPERVISOR, DocuportConstants.ALL_FULL_NAME);
        String expected = DocuportConstants.FULL_NAME1_SUPERVISOR;
        System.out.println("Full name: " + actual);
        Assert.assertEquals(actual, expected);

        String actualUserName = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_GROUP1_SUPERVISOR, DocuportConstants.ALL_USERNAME);
        String expectedUserName = DocuportConstants.USER_NAME1_SUPERVISOR;
        System.out.println("User name:" + actualUserName);
        Assert.assertEquals(actualUserName, expectedUserName);

        String actualUserNameRole = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_GROUP1_SUPERVISOR, DocuportConstants.ALL_ROLE);
        String expectedUserNameRole =DocuportConstants.ROLE_NAME1_SUPERVISOR;
        System.out.println("Role: " + actualUserNameRole);
        Assert.assertEquals(actualUserNameRole, expectedUserNameRole);

        String actualUserPhoneNumber = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_GROUP1_SUPERVISOR, DocuportConstants.ALL_PHONE_NUMBER);
        String expectedUserPhoneNumber = DocuportConstants.PHONE_NUMBERS1_SUPERVISOR;
        System.out.println("Phone number: " + actualUserPhoneNumber);
        Assert.assertEquals(actualUserPhoneNumber, expectedUserPhoneNumber);
    }
}

