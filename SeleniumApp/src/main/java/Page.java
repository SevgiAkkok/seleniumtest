import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page extends BasePage{

    public Page(WebDriver driver) {
        super(driver);
    }

    private static String weburl="http://thedemosite.co.uk/login.php";



    @FindBy (className="FormsButton2")
    private WebElement button;

    public void getLoginPage()
    {
        button.click();
    }
    public String getUrl()
    {
        return weburl;
    }

}
