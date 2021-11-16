//Homework - 3
//Open url : http://automationpractice.com/index.php
//Click on Sign In
//Enter correct Email in Email field
//Enter wrong Password in Password field
//Click on the Sign In button.
//Expected Result:
//Error Message “There is 1 error”

package testsuit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationPractice extends BaseClass {
    String baseUrl="http://automationpractice.com/index.php";
    @Before
    public void start(){
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldSignInInAutomationPractice(){
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("avya987@gamil.com");
        driver.findElement(By.id("passwd")).sendKeys("123454");
        driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
        String expectedResult="There is 1 error";
        WebElement message= driver.findElement(By.xpath("//p[text()='There is 1 error']"));
String actualResult=message.getText();
        Assert.assertEquals("User successfully sign in",expectedResult,actualResult);
    driver.quit();
    }
}
