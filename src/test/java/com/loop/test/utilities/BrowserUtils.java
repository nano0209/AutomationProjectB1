package com.loop.test.utilities;

import com.loop.test.base.TestBase;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BrowserUtils {
    /**
     * validate if driver switched to expected url and title
     *
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author Naima
     * implements assertion
     * note; usually we do not do validation in metjhod this is for practicing purposes
     */
    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle) {
        expectedUrl = expectedUrl.toLowerCase();
        expectedTitle = expectedTitle.toLowerCase();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)) {
                break;
            }

        }
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));

    }

    /**
     * switches to new window bt the exact title
     * returns to original window if windows with given title not found
     */
    public static void switchToWindow(WebDriver driver, String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)) {
                return;
            }
        }
        driver.switchTo().window(origin);

    }

    /**
     * @param driver expectedTitle
     *               returns void, assertion is implemented
     * @author Naima
     */
    public static void validateTitle(WebDriver driver, String expectedTitle) {
        assertTrue(driver.getTitle().contains(expectedTitle));

    }


    /**
     * Click any link from loop practice
     *
     * @param nameOfPage
     * @author nsh
     */
    public static void loopLinkClick(String nameOfPage) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfPage + "']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    /**
     * method for hover over
     * @param element
     * @author Naima
     */
    public static void hoverOverElement(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();

    }

    /**
     * method scroll to element
     * @param webelement
     */
    public static void scrollToElement(WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);

    }

    /**
     * method which scroll to element and click
     * @param element
     */
    public static void scrollAndClick(WEbElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click",element);

    }

    /**
     * method which scoll to element and click js
     * @param element
     */
public static void doubleClick(WebElement element){
     new Actions(Driver.getDriver()).doubleClick().perform();
}

/**
 * method to be providing element to ve visible
 * @param element
 * @param timeToWaitSec
 * return element
 * @author Naima
 */
public static void WebElement waitForVisibility(WebElement element, int timeToWaitSec){
    WebDriverWait wait = new WebDriverWait (Driver.getDriver().Duration.ofSeconds(timeToWaitSec));
    return wait.until(ExpectedCondition.visibilityOf(element));

    }
}
