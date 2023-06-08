package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_dropdown_without_select {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
//        driver.get(DocuportConstants.USERNAME_ADVISOR);
//        driver.get(DocuportConstants.PASSWORD_All);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void testDropDown() throws InterruptedException {
        WebElement username = driver.findElement(By.xpath("//input[@id='input-14']"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement password= driver.findElement(By.xpath("//input[@id='input-15']"));
        password.sendKeys(DocuportConstants.PASSWORD_All);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement receivedDocuments = driver.findElement(By.xpath("//span[.='Received docs']"));
        receivedDocuments.click();

        WebElement searchButton = driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
        searchButton.click();

        WebElement statusButton = driver.findElement(By.xpath("(//label[.='Status']/../div/following-sibling::div)[2]"));
        statusButton.click();

        Thread.sleep(3000);

        WebElement inProgressStatus = driver.findElement(By.xpath("//div[contains(text(),'In progress')]"));
        inProgressStatus.click();










    }
}

