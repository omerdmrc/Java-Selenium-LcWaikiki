import org.junit.jupiter.api.*;

import java.awt.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestMainMethods extends BaseTest{
    HomePage homePage;
    LoginPage loginPage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    BoxPage boxPage;


    @Test
    @Order(1)
    public void openHomePage() throws InterruptedException {
        Thread.sleep(1000);
        homePage=new HomePage(driver);
        Assertions.assertEquals(homePage.isonHomePage(),"https://www.lcwaikiki.com/tr-TR/TR");
    }

    @Test
    @Order(2)
    public void openLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        homePage.openLoginPage();
        Assertions.assertTrue(loginPage.isonLoginPage(),
                "not on login page");

    }


    @Test
    @Order(3)
    public void Login() throws InterruptedException {
        Thread.sleep(1000);
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        loginPage.login();
        Assertions.assertEquals(homePage.isonHomePage(),"https://www.lcwaikiki.com/tr-TR/TR");

    }

    @Test
    @Order(4)
    public void search() throws InterruptedException {
        Thread.sleep(1000);
        homePage=new HomePage(driver);
        productPage=new ProductPage(driver);
        homePage.searchBox().search("pantolan");
        Assertions.assertTrue(productPage.isOnProductPage(),
                "Not on products page");

    }
    @Test
    @Order(5)
    public void scroll() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        productPage =new ProductPage(driver);
        productPage.scrollEndOfPage();

    }
    @Test
    @Order(6)
    public void clickShowMore() throws InterruptedException {
        Thread.sleep(1000);
        productPage =new ProductPage(driver);
        productPage.clickShowMore();

    }
    @Test
    @Order(7)
    public void selectProduct() throws InterruptedException {
        Thread.sleep(1000);
        productPage =new ProductPage(driver);
        productDetailPage=new ProductDetailPage(driver);
        productPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isonProductDeatilPage(),
                "Not on product detail page!");



    }
    @Test
    @Order(8)
    public void addToCard() throws InterruptedException {

        Thread.sleep(1000);
        productDetailPage =new ProductDetailPage(driver);
        productDetailPage.addToCart();

    }

    @Test
    @Order(9)
    public void goToBox() throws InterruptedException {
        Thread.sleep(1000);
        homePage=new HomePage(driver);
        boxPage=new BoxPage(driver);
        homePage.goToBox();
        Assertions.assertTrue(boxPage.checkProduct(),
                "Product was not added to card");


    }

    @Test
    @Order(10)
    public void compareToCosts() throws InterruptedException {
        Thread.sleep(1000);

        boxPage=new BoxPage(driver);

        Assertions.assertEquals(ProductDetailPage.productDetailC,boxPage.productCost());



    }
    @Test
    @Order(11)
    public void increaseProduct() throws InterruptedException {
        Thread.sleep(1000);
        boxPage=new BoxPage(driver);
        boxPage.increaseProduct();
        Assertions.assertEquals("2",boxPage.productCount());


    }
    @Test
    @Order(12)
    public void clearBox() throws InterruptedException {
        Thread.sleep(1000);
        boxPage.clearBox();
        Thread.sleep(2000);
        Assertions.assertTrue(boxPage.isBoxEmpty(),
                "Box not empty");


    }



}
