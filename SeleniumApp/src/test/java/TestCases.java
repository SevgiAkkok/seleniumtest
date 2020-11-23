import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases extends BaseTest{
    @Test

    public void test_1_homePageControl()
    {
        Page page=new Page(driver);
        driver.get(page.getUrl());
        Assert.assertTrue(driver.getTitle().equals("Login example page to test the PHP MySQL online system"));

        WebElement pageTitle= driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/p[1]/big/strong"));
        Assert.assertTrue(pageTitle.getText().equals("4. Login"));

        WebElement statusMessage= driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
        Assert.assertTrue(statusMessage.getText().equals("**No login attempted**"));

        WebElement infoMessage= driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/blockquote/blockquote/p"));
        Assert.assertTrue(infoMessage.getText().equals("Enter your login details you added on the previous page and test the login.\n" +
                "The success or failure will be shown above."));
    }
    @Test
    public void test_1_logIn()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterLoginForm("testuser", "testpass");
        loginPage.submit();

        /*
       Alert alert=driver.switchTo().alert();
       String alertMesssage=driver.switchTo().alert().getText();
       String actualMessage=alertMesssage;

       if(actualMessage.contains("Username too short.  The username must be at least 4 characters in length."))
       {
           String expectedErrorMessage="Username too short.  The username must be at least 4 characters in length.";
           Assert.assertEquals(actualMessage,expectedErrorMessage);
           alert.accept();
       }
        else if(actualMessage.contains("Password too short.  The password must be at least 4 characters in length."))
       {
           String expectedErrorMessage="Password too short.  The password must be at least 4 characters in length.";
           Assert.assertEquals(actualMessage,expectedErrorMessage);
           alert.accept();

       }*/

    }

}