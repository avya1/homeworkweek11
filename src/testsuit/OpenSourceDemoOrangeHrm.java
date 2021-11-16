/*
Homework – 4
https://opensource-demo.orangehrmlive.com/
( Username : Admin | Password : admin123 )
Enter username
Enter password
Click login
Verify that the text “Welcome Paul”
After Paul one symbol there so click on the symbol for logout.
Verify the below text.
LOGIN Panel

 */

package testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testsuit.BaseClass;

public class OpenSourceDemoOrangeHrm extends BaseClass {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void start() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyAndVerifyLoginPanel() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        String expectedResult = "Welcome";
        WebElement message = driver.findElement(By.xpath("//font[text()='Welcome Javier']"));
        String actualResult = message.getText();

        if (actualResult.contains("Welcome")) expectedResult = actualResult;

        Assert.assertEquals("User not login successfully", expectedResult, actualResult);
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.xpath("//font[text()='Logout']")).click();
        String expectedText1 ="LOGIN Panel";
        String atcualText1= driver.findElement(By.id("logInPanelHeading")).getText();
        Assert.assertEquals("You are not logged out",expectedText1,atcualText1);



    }
@After
    public void stop(){
        closeBrowser();
}
}
