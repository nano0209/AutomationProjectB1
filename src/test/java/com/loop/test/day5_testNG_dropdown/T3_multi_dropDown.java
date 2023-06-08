package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class T3_multi_dropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDownMethod(){
       // driver.close();
    }

    @Test
    public void multiSelectTest(){
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        Assert.assertTrue(dropdown.isMultiple());

//        dropdown.selectByIndex(0);
//        dropdown.selectByValue("saab");
//        dropdown.selectByVisibleText("Opel");
//        dropdown.selectByIndex(3);

        List<WebElement> opstions = new ArrayList<>();
        opstions = dropdown.getOptions();

        opstions.forEach(option->{
            option.click();
            System.out.println("option =" +option.getText());
        });

        System.out.println("=====================================");

        for (WebElement option : opstions){
            option.click();
            System.out.println("Option: " + option.getText());
        }

        //di select all value
       // dropdown.deselectAll();

        //System.out.println("selected option:" + dropdown.getOptions());


        }


    }




