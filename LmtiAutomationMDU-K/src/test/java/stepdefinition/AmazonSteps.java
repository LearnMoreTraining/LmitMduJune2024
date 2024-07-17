package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import pageobjects.BabyWishPage;
import pageobjects.HomePage;
import utility.BrowserBase;

public class AmazonSteps {
    WebDriver driver; //null
    @Given("user navigates to baby wishlist page")
    public void navigation(){
        BrowserBase base = new BrowserBase();
        driver = base.getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.clickBabyWishList();
    }

    @Then("validate the Baby wish list text")
    public void validateTheBabyWishListText() {
        BabyWishPage babyWishPage = new BabyWishPage(driver);
        String output =babyWishPage.getBabyWishListText();
        System.out.println(output);
    }
}
