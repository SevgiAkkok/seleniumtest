import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    WebElement txbx_username= driver.findElement(By.name("username"));
    WebElement txbx_password= driver.findElement(By.name("password"));
    WebElement button= driver.findElement(By.name("FormsButton2"));

    public void enterLoginForm(String user,String password)
    {

        this.txbx_username.clear();
        this.txbx_username.sendKeys(user);

        this.txbx_password.clear();
        this.txbx_password.sendKeys(password);

    }
    public void submit()
    {
        button.click();
    }



}
