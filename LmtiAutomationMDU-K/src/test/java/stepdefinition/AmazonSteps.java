package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserBase;


public class AmazonSteps {

    WebElement element ;
    BrowserBase browserBase;
    WebDriver driver;

    public AmazonSteps(){
       browserBase = new BrowserBase();
    }


    @When("user enter the product name {string}")
    public void userEnterTheProductName(String prductName) {
    }

    @Then("user validates the results")
    public void userValidatesTheResults() {

    }

    @And("user validate the title")
    public void userValidateTheTitle() {

    }

    @And("user clicks the login icon")
    public void userClicksTheLoginIcon() {

    }

    @When("extract the dropdown values")
    public void extractTheDropdownValues() {

    element = driver.findElement(By.id("searchDropdownBox"));
      int dropdownSize =  element.findElements(By.tagName("option")).size();

        for(int i =0 ; i < dropdownSize ; i++ ){
           String value= element.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);
        }
    }

    @And("user selects the dropdown value")
    public void userSelectsTheDropdownValue() {

        Select categoryDropdown = new Select(element);
     //   categoryDropdown.selectByIndex(10);
     //   categoryDropdown.selectByVisibleText("Gift Cards");
        categoryDropdown.selectByValue("search-alias=automotive");

        WebElement e = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select currencyDropdwon = new Select(e);
        currencyDropdwon.selectByIndex(4);

    }

    @When("user clicks the baby wishlist")
    public void userClicksTheBabyWishlist() {
       driver =  browserBase.getDriver();
        WebElement element1 = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);
        action.clickAndHold(element1).build().perform();
       // driver.findElement(By.linkText("Baby Wishlist")).click();
        driver.findElement(By.partialLinkText("by Wish")).click();

    }
}
