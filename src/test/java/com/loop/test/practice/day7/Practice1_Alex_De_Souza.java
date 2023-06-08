package com.loop.test.practice.day7;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1_Alex_De_Souza extends TestBase {

    @Test(priority = 1)
    public void web_test() {
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();

        String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.ALL_FULL_NAME);
        String expected = DocuportConstants.ALEX_DE_SOUZA;
        System.out.println("Full name: " + actual);
        Assert.assertEquals(actual, expected);

        String actualUserName = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.ALL_USERNAME);
        String expectedUserName = DocuportConstants.USER_NAME_ALEX;
        System.out.println("User name:" + actualUserName);
        Assert.assertEquals(actualUserName, expectedUserName);

        String actualUserNameRole = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.ALL_ROLE);
        String expectedUserNameRole = DocuportConstants.ROLE_NAME_ALEX;
        System.out.println("Role: " + actualUserNameRole);
        Assert.assertEquals(actualUserNameRole, expectedUserNameRole);
        String actualUserPhoneNumber = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.ALL_PHONE_NUMBER);
        String expectedUserPhoneNumber = DocuportConstants.PHONE_NUMBERS_ALEX;
        System.out.println("Phone number: " + actualUserPhoneNumber);
        Assert.assertEquals(actualUserPhoneNumber, expectedUserPhoneNumber);

        String actualUserEmail = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.EMAIL_ALEX);
        String expectedUserEmail = DocuportConstants.EMAIL_ALEX;
        System.out.println("Email: " + actualUserEmail);
        Assert.assertEquals(actualUserEmail, expectedUserEmail);

        String actualUserAdvisor = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.EMAIL_ALEX, DocuportConstants.ALL_ADVISOR);

        String expectedUserAdvisor = DocuportConstants.ADVISORS_ALEX;
        System.out.println("Advisor: " + actualUserAdvisor);
        Assert.assertEquals(actualUserAdvisor, expectedUserAdvisor);

    }
}