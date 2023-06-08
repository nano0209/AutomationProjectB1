package com.loop.test.day4_xpath_findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
        1. Go to http://the-internet.herokuapp.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.

         */

//public class T3_checkbox1 {
//    public static void main(String[] args) {
//
//        WebElement checkBox1 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(., 'checkbox 1')]/preceding-sibling::input"));
//        if (checkBox1.isSelected()) {
//            System.out.println("test failed");
//        } else {
//            System.out.println("test passed");
//        }
//
//        checkBox1.click();
//        if (checkBox1.isSelected()) {
//            System.out.println("test passed");
//        } else {
//            System.out.println("test failed");
//        }
//
//    }
//}
