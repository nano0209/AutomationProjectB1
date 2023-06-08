package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {


        // setting up the web driver
        WebDriverManager.chromedriver().setup();

        //create instance of driver
        WebDriver driver = new ChromeDriver();
        Thread.sleep(300);


        //driver.get("https://etsy.com");// opens browser


        //maximize
        driver.manage().window().maximize(); //this one is popular
        Thread.sleep(300);
        //driver.manage().window().fullscreen();

        //navigate to
        driver.navigate().to("https://etsy.com");// opens browser
        Thread.sleep(300);

        // lest slow things a bit in order to see what is going on
        Thread.sleep(300);

        //Navigate back takes us to previous
        driver.navigate().back();

        // navigate forward
        driver.navigate().forward();

        // navigate refresh
        driver.navigate().refresh();







    }

}
