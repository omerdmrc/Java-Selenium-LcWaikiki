import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestLogger.class)
public class BaseTest {


    WebDriver driver;


    @BeforeAll
    public void setup(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver=new ChromeDriver(options);
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }


    @AfterAll
    public void finish(){

        driver.quit();



    }






}
