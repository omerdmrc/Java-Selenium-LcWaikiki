import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator= By.id("search");
    By searchButton=By.className("search-button");

    public SearchBox(WebDriver driver) {
        super(driver);
    }


    public void search(String text){

        sendKeys(searchBoxLocator,text);
        click(searchButton);

    }



}
