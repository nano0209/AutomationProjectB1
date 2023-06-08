package com.loop.test.practice.day9;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtraTask {
    /*
    1. login docuport as a advisor
2. go to my loads
3. try to upload a file
(do not spend more than 20 mins, if you can not, can not)
     */

    @Test
    public void docuport(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        DocuportUtils.login(Driver.getDriver(), "advisor");
        WebElement myUpload = Driver.getDriver().findElement(By.xpath("//span[.='My uploads']"));
        myUpload.click();

        WebElement uploadDocuments = Driver.getDriver().findElement(By.xpath("//span[text()='Upload documents']"));
        uploadDocuments.click();
        WebElement uploadFile = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        String path = "C://Users//naima//OneDrive//Desktop//some-file.txt";
        uploadFile.sendKeys(path);

        WebElement client = Driver.getDriver().findElement(By.xpath("//label[contains(.,'Client')]/.."));
        client.click();
        WebElement clickTest = Driver.getDriver().findElement(By.xpath("//div[.='Test']"));
        clickTest.click();


        WebElement service = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[3]"));
        service.click();
        WebElement bookkeeping = Driver.getDriver().findElement(By.xpath("(//div[.='Bookkeeping'])[4]"));
        bookkeeping.click();

        WebElement docType = Driver.getDriver().findElement(By.xpath("//span[@class='v-chip__content']"));
       docType.click();
       WebElement quarter4 = Driver.getDriver().findElement(By.xpath("//span[text()=' Q4 ']"));
       quarter4.click();


        WebElement description = Driver.getDriver().findElement(By.id("input-139"));
        description.sendKeys("new client");

        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//label[.='Upload on behalf of client']/.."));
        checkBox.click();

        WebElement upload = Driver.getDriver().findElement(By.xpath("//span[.=' Upload ']"));
        upload.click();

        WebElement successfulMessage = Driver.getDriver().findElement(By.xpath("//div[@class='docu-notifications']"));
        String expected = "Document(s) have been uploaded successfully";
        Assert.assertEquals(successfulMessage.getText(),expected);

    }
}
