/*
Homework – 2
Navigate to website "https://demo.nopcommerce.com/"
Click on the register link.
Fill in all the fields.
Click on the register button.
Verify that the user registered successfully.

 */
package testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.time.LocalDateTime.*;

public class NopComRegister extends BaseClass {
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void start(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldRegisterOnNopCommerceRegisterPage(){
driver.findElement(By.xpath("//a[@class='ico-register']")).click();
String expectedResult="Register";
        WebElement message=driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualResult=message.getText();
        Assert.assertEquals("User is not in Registration page",expectedResult,actualResult);
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("chiku");
        driver.findElement(By.id("LastName")).sendKeys("Thakur");
        Select day=new Select(driver.findElement(By.name("DateOfBirthDay")));
               day .selectByValue("3");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("May");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue("2017");
        driver.findElement(By.id("Email")).sendKeys("chiku12345667@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("abc");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("abc123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
        driver.findElement((By.id("register-button"))).click();
        String expectedResult1="Register";
        WebElement message1=driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualResult1=message1.getText();
        Assert.assertEquals("User is not register successfully",expectedResult1,actualResult1);

    }
    @After
    public void close()
    {
        closeBrowser();
    }
}
