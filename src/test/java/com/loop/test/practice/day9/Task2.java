package com.loop.test.practice.day9;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class Task2 {
/*
1. Go to https://loopcamp.vercel.app/hovers.html
2. Hover over to first image
3. Assert:
	a. “name: user1” is displayed
	b. “view profile” is displayed
4. Hover over to second image
5. Assert:
	a. “name: user2” is displayed
	b. “view profile” is displayed
6. Hover over to third image
7. Confirm:
	a. “name: user3” is displayed
	b. “view profile” is displayed

 */

    @Test
    public void tets() throws  InterruptedException{
        Driver.getDriver().get("https://loopcamp.vercel.app/hovers.html");
        Actions action = new Actions(Driver.getDriver()) ;
        WebElement firstImage = Driver.getDriver().findElement(By.xpath("//img[@alt='User Avatar']"));
        Thread.sleep(3000);
        action.moveToElement(firstImage).perform();
        WebElement image = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']") );
        Assert.assertTrue(image.isDisplayed());
        WebElement viewProfile= Driver.getDriver().findElement(By.xpath("//a[@href='users/1.html']"));
        Assert.assertTrue(viewProfile.isDisplayed());

        //Second image

        WebElement secondImage = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        action.moveToElement(secondImage).perform();
        WebElement image2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']") );
        Assert.assertTrue(image2.isDisplayed());
        WebElement viewProfile2 = Driver.getDriver().findElement(By.xpath("//a[@href='users/2.html']"));
        Assert.assertTrue(viewProfile2.isDisplayed());

        //Third image

        WebElement thirdImage = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));
        action.moveToElement(thirdImage).perform();
        WebElement image3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']") );
        Assert.assertTrue(image3.isDisplayed());
        WebElement viewProfile3 = Driver.getDriver().findElement(By.xpath("//a[@href='users/3.html']"));
        Assert.assertTrue(viewProfile3.isDisplayed());









    }




}
