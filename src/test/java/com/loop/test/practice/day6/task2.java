package com.loop.test.practice.day6;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class task2 extends TestBase {
    /*
    1. go to https://demoqa.com/nestedframes
2. Validate "Child Iframe" text
3. Validate "Parent Iframe" text
4. Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspector or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame."
     */




    @Test
    public void iFrame(){
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("//p[.='Child Iframe']"));
       actual = element.getText();
       expected = "Child Iframe";
       assertEquals(actual, expected,"actual does not match the expected");

       driver.switchTo().parentFrame();
       WebElement element1 = driver.findElement(By.xpath("//body[.='Parent frame']"));
       actual = element1.getText();
       expected = "Parent frame";
       assertEquals(actual, expected,"actual does not match the expected");

       driver.switchTo().defaultContent();
       WebElement element3 = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page')]"));
       actual = element3.getText();
       expected = "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.";
       assertEquals(actual, expected, "actual does not match the expected");




    }

}
