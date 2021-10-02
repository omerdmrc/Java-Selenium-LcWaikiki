import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    static String productDetailC;
    By isondetailPageLocator= By.cssSelector("a[class='collapse-link']");
    By sizeSelectorLocator=By.xpath("(//a[@key='1'])[1]");
    By addtoCardBoxLocator=By.id("pd_add_to_cart");
    By productCost=By.xpath("(//span[@class='price'])[2]");
    //String detailCost;


    public ProductDetailPage(WebDriver driver) {
        super(driver);
        //this.detailCost=find(productCost).getText();

    }

    public boolean isonProductDeatilPage() {

        return find(isondetailPageLocator).isDisplayed();
    }

    public void addToCart() {
        productDetailC=find(productCost).getText();
        System.out.println("PriceDetail: "+find(productCost).getText());
        click(sizeSelectorLocator);
        click(addtoCardBoxLocator);

    }



}
