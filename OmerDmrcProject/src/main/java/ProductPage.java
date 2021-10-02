import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class ProductPage extends BasePage {

    By filterLabel= By.id("filter-label");
    By selectedProduct=By.cssSelector("a[class='a_model_item']");
    By showMoreButtonLocator=By.cssSelector("a[class='lazy-load-button']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(filterLabel);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();


    }

    public void scrollEndOfPage() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_END);
        robot.keyRelease(KeyEvent.VK_END);
        robot.keyRelease(KeyEvent.VK_CONTROL);


    }

    public void clickShowMore() {
        click(showMoreButtonLocator);

    }
    private List<WebElement> getAllProducts(){
        return findAllElements(selectedProduct);


    }
}
