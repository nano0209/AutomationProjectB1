package com.loop.test.practice.day9;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3 {
    /*
    1. Go to https://loopcamp.vercel.app/upload.html
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
	-File uploaded text is displayed on the page

     */

@Test
public void test(){

    Driver.getDriver().get("https://loopcamp.vercel.app/upload.html");
    WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

    String path = "C://Users//naima//OneDrive//Desktop//some-file.txt";
    chooseFile.sendKeys(path);

    WebElement upload = Driver.getDriver().findElement(By.id("file-submit"));
    //upload.click();
    String expected ="File uploaded";
    String actual = Driver.getDriver().findElement(By.className("error-code")).getText();
    assertFalse((actual.equals(expected)),"Actual does not match expected");




}
}
