package com.loop.test.practice.day8;
import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task2 extends TestBase {

    @Test
    public void docuportRegistration(){

        driver.get("https://app.docuport.app/company-formation/resident");
        WebElement element = driver.findElement(By.xpath("(//input[@role='radio'])[2]//following-sibling::div"));
        element.click();
        WebElement element1 = driver.findElement(By.xpath("(//input[@role='radio'])[5]//following-sibling::div"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        element2.sendKeys("Loop Academy");

        WebElement element3 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        element3.sendKeys("IT");

        WebElement element4 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        element4.click();

        WebElement educationTraining = driver.findElement(By.xpath("//div[contains(text(),'Education & Training')]"));
        educationTraining.click();

        WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
        firstName.sendKeys("Mary");

        WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
        lastName.sendKeys("Bingo");

        WebElement emailAddress = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
        emailAddress.sendKeys("maryB@gmail.com");

        WebElement phoneNumber = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        phoneNumber.sendKeys("7036665678");

        WebElement fax = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
        fax.sendKeys("7033457865");

        WebElement nextButton = driver.findElement(By.xpath("(//span[.=' Next '])[1]"));
        nextButton.click();

        WebElement companyButton = driver.findElement(By.xpath("//label[.='Company']"));
        companyButton.click();



    }
}
