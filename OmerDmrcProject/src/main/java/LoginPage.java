import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By emailBoxLocator= By.id("LoginEmail");
    By passwordBoxLocator=By.id("Password");
    By loginButton=By.id("loginLink");
    By loginisPageLocator=By.id("loginLink");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        sendKeys(emailBoxLocator,"yourmail@hotmail.com");
        sendKeys(passwordBoxLocator,"yourpassword");
        click(loginButton);
    }

    public boolean isonLoginPage() {
        return find(loginisPageLocator).isDisplayed();
    }
}
