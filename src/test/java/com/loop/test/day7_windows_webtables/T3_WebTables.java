package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_WebTables extends TestBase {
      /*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */

    @Test
    public void test_web_tables(){
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        String actual = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "full name");
        String expected = "Alex De Souza";
        System.out.println("actual = " + actual);
        assertEquals(actual, expected);

        String actualUserName = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "username");
        String expectedUserName = "alexdesouze";
        System.out.println("actualUserName = " + actualUserName);
        assertEquals(actualUserName, expectedUserName);
    }


    }



