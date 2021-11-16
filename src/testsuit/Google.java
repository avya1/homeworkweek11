/*
Homework -1
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to the Computers page.
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to the Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.

 */
package testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Google extends BaseClass {
    String baseUrl = "https://www.google.com/";

    @Before
    public void start() {
        openBrowser(baseUrl);
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store", Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
    }

    @Test
    public void verifyUserShouldEnterInNopCommercePageSuccessFully() {
        driver.findElement(By.linkText("Computers")).click();
        //validation start
        String expectedResult = "Computers";
        WebElement message = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualResult = message.getText();
        Assert.assertEquals("User is not in computer page", expectedResult, actualResult);
        //validation finished
        driver.quit();

    }

    @Test
    public void verifyUserShouldEnterInElectronicsPageSuccessfully() {
        start();
        driver.findElement(By.linkText("Electronics")).click();
        //validation
        String expectedResult = "Electronics";
        WebElement compare = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualResult = compare.getText();
        Assert.assertEquals("User is not in electronic page", expectedResult, actualResult);
        driver.quit();
    }

    @Test
    public void verifyUserShouldEnterInApparelPageSuccessfully() {
        driver.findElement(By.linkText("Apparel")).click();
        //validation
        String expectedResult = "Apparel";
        WebElement message = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualResult = message.getText();
        Assert.assertEquals("user is not in Apparel page", expectedResult, actualResult);
        driver.quit();
    }

    @Test
    public void verifyUserShouldEnterInDigitalDownloadPageSuccessfully() {
        driver.findElement(By.linkText("Digital downloads")).click();
        //validation
        String expectedResult = "Digital downloads";
        WebElement message = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualResult = message.getText();
        Assert.assertEquals("User is not in Digital download page", expectedResult, actualResult);
        driver.quit();
    }

    @Test
    public void verifyUserShouldEnterInBooksPageSuccessfully() {
        driver.findElement(By.linkText("Books")).click();
//validation
        String expectedResult = "Books";
        WebElement message = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualResult = message.getText();
        Assert.assertEquals("User is not in Books Page", expectedResult, actualResult);
        driver.quit();
    }

    @Test
    public void verifyUserShouldEnterInJewelryPageSuccessfully() {
        driver.findElement(By.linkText("Jewelry")).click();
//validation
        String expectedResult = "Jewelry";
        WebElement message = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualResult = message.getText();
        Assert.assertEquals("User is not in Jewelry page", expectedResult, actualResult);
        driver.quit();
    }

    @Test
    public void verifyUserShouldEnterInGiftCardsPageSuccessfully() {
        driver.findElement(By.linkText("Gift Cards")).click();
        //validation
        String expectedResult = "Gift Cards";
        WebElement message = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualResult = message.getText();
        Assert.assertEquals("User is not in gift card page", expectedResult, actualResult);
driver.quit();
    }
    @After
    public void close(){
        closeBrowser();
   }



}
