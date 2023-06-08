package com.loop.test.day9_driver_faker_action;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T6_Registration_Form {

    @Test
    public void registration_form_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement registrationForm = Driver.getDriver().findElement(By.xpath("//a[.='Registration Form']"));
        registrationForm.click();
        Faker faker = new Faker();


        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.bothify("???###"));

        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());

        WebElement phoneNumber= Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("571-###-####"));

        WebElement other = Driver.getDriver().findElement(By.xpath("//input[@value='other']"));
        other.click();

        WebElement dateOfBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirthday.sendKeys("03/4/2000");

        Select office = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        office.selectByIndex(faker.number().numberBetween(1,9) ) ;
        Select jobTitle = new Select(Driver.getDriver().findElement(By.name("job_title"))) ;
        jobTitle.selectByIndex(4 ) ;
        WebElement button = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']") );
        button.click();
        WebElement singUp = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
       // singUp.click();














    }


}
