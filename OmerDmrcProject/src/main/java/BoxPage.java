import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoxPage extends BasePage{

    By increaseButtonLocator= By.cssSelector("a[class='oq-up plus']");
    By productCost=By.cssSelector("span[class='rd-cart-item-price mb-15']");
    By clearButtonLocator=By.cssSelector("a[title='Sil']");
    By clearbuttonVerifyLocator=By.cssSelector("a[class='inverted-modal-button sc-delete ins-init-condition-tracking']");
    By isonBoxPageLocator=By.cssSelector("a[class='main-button mt-15']");
    By checkBoxLocator=By.cssSelector("a[class='homepage-link mt-20']");
    By productCount=By.cssSelector("input[class='item-quantity-input ignored']");



    public BoxPage(WebDriver driver) {
        super(driver);
    }

    public String productCount(){

        return  find(productCount).getAttribute("value");

    }
    public boolean checkProduct() {

        return find(isonBoxPageLocator).isDisplayed();

    }

    public String productCost() {

        System.out.println("productCost: "+find(productCost).getText());

        return find(productCost).getText();
    }

    public void clearBox() throws InterruptedException {
        Thread.sleep(2000);
        click(clearButtonLocator);
        Thread.sleep(2000);
        click(clearbuttonVerifyLocator);
    }

    public void increaseProduct() {
        click(increaseButtonLocator);
    }
    public boolean isBoxEmpty(){

        return find(checkBoxLocator).isDisplayed();

    }
}
