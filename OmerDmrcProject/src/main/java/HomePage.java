import com.sun.xml.internal.ws.policy.AssertionSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By loginButtonLocator = By.id("header-user-section");
    By goToBoxLocatorButton=By.cssSelector("i[class='header-bag-icon bndl-shopping-bag bndl-shopping-bag-dims']");
    SearchBox searchBox;


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }

    public SearchBox searchBox() {

        return this.searchBox;
    }


    public void goToBox() {
        click(goToBoxLocatorButton);

    }



    public void openLoginPage() {
        click(loginButtonLocator);

    }

    public String isonHomePage() {

       return driver.getCurrentUrl();

    }
}
