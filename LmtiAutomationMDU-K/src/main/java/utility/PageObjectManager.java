package utility;

import org.openqa.selenium.WebDriver;
import pageobjects.BabyWishPage;
import pageobjects.HomePage;
import pageobjects.ProductSpecifcPage;
import pageobjects.ResultPage;

public class PageObjectManager {

    WebDriver driver;
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public BabyWishPage getBabyWishList(){
        BabyWishPage babyWishPage = new BabyWishPage(driver);
        return babyWishPage;
    }

    public HomePage getHomePage(){
        HomePage homePage = new HomePage(driver);
        return homePage;
    }

    public ProductSpecifcPage getProductSpecificPage(){
        ProductSpecifcPage pageObjectManager = new ProductSpecifcPage(driver);
        return pageObjectManager;
    }

    public ResultPage getResultPage(){
        ResultPage resultPage = new ResultPage(driver);
        return resultPage;
    }


}
