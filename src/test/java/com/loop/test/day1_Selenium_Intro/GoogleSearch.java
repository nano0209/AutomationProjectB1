//package com.loop.test.day1_Selenium_Intro;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class GoogleSearch {
//
//    public static void main(String[] args) {
//
//        /*
//        Navigate to google source
//        get title of the page
//        get url of the page
//        validate the title expected title is "Google"
//        validate the url of the page expected url is "https://google.com/"
//
//         */
//
//
//        // se tup the diver
//        WebDriverManager.chromedriver();
//
//        //create driver object
//        WebDriver driver = new ChromeDriver();
//        //navigate to google page
//        driver.get("https://google.com/");
//
//        // maximize the window
//        driver.manage().window().maximize();
//
//
//        String expectedTitle = "Google";
//        String expectedUrl = "https://google.com/";
//        String actualUrl = driver.getTitle();
//
//        System.out.println("actualTitle = " + actualUrl);
//
//
//        if (actualTitle.contains(expectedTitle)){
//            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ", =. TEST PASS");
//        } else {
//            System.err.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ", =. TEST FAIL");
//        }
//
//        String actualUrl = driver.getCurrentUrl();
//
//        if (actualUrl.contains(expectedUrl)){
//            System.out.println("Actual url: " + actualUrl + ", matches expected url: " + expectedUrl + ", => TEST PASS");
//        } else {
//            System.err.println("Actual url: " + actualUrl + ", DOES NOT match expected url: " + expectedUrl + ", => TEST FAIL");
//        }
//
//
//            }
//
//
//
//        //close the browser
//        driver.quit();


//
//    }
//
//}
