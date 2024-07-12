package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSteps {


    WebDriver driver;

    @Given("user naviagtes to amazon Home page")
    public void amazonHomePage(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
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

        WebElement element = driver.findElement(By.id("searchDropdownBox"));
      int dropdownSize =  element.findElements(By.tagName("option")).size();

        for(int i =0 ; i < dropdownSize ; i++ ){
           String value= element.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);
        }
    }
}
