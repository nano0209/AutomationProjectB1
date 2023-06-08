package com.loop.test.day8_webtable_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T0_pizza_order extends TestBase {

    /*
    validate that card number for Alexandria Gray is 321456789012
     */

     /*
    1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
     */
     @Test
     public void validate_card_for_alexandra(){
         driver.get("https://loopcamp.vercel.app/web-tables.html");
         String name = "Alexandra Gray";
         String expectedCardNumber = "321456789012";
         String actualCardNumber = driver.findElement(By.xpath("//td[contains(text(),'321456789012')]")).getText();
         assertEquals(actualCardNumber, expectedCardNumber);

         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name,"Card Number"), expectedCardNumber);
     }
    @BeforeMethod
    public void url (){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
    }

     @Test
    public void test_pizza_type(){
         String name = "Alexandra Gray";
         String expectedPizzaType = "Thin Crust";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Pizza type"), expectedPizzaType);
     }


    @Test
    public void test_amount(){
        String name = "John Doe";
        String expectedAccount = "3";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Amount"), expectedAccount);

     }
    @Test
    public void test_date(){
         //String name = "Bob Martin";
         String expectedDate = "12/31/2021";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,"Bob Martin", "Date" ), expectedDate);

    }

    @Test
    public void test_street(){
         //String name = "Robert Baratheon";
         String expectedStreet = "29, Sanderson Ave";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,"Robert Baratheon", "Street"),expectedStreet);

    }

    @Test
    public void test_city(){
         //String name = "Ned Stark";
         String expectedCity = "Newcastle";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, "Ned Stark", "City" ), expectedCity);


    }

    @Test
    public void test_state(){
        // String name = "Stewart Dawidson";
         String expectedState = "Canada";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,"Stewart Dawidson", "State"),expectedState);

    }

    @Test
    public void test_zip(){
         //String name = "Samuel Jackson";
         String expectedZip = "53665";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, "Samuel Jackson", "Zip"),expectedZip);

    }

    @Test
    public void test_card(){
         //String name = "Robert Baratheon";
         String expectedCard = "MasterCard";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,"Robert Baratheon", "Card"),expectedCard);

    }

    @Test
    public void test_card_number(){
         //String name = "Alexandra Gray";
         String expectedCardNumber = "321456789012";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, "Alexandra Gray", "Card Number"),expectedCardNumber);

    }

    @Test
    public void test_exp(){
         //String name = "John Doe";
         String expectedExp = "01/23";
         assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, "John Doe", "Exp" ),expectedExp);

    }

}
