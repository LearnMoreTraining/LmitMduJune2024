package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMoreSteps {

    WebDriver driver ; //null

    @When("user enters the username {string} and password {string}")
    public void enterCredi(String username, String password){

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

    }

    @And("user clicks the login button")
    public void clickLoginButton() {

        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    @Then("user validates the error message {string}")
    public void validateErrorMessage(String errorMessage) {

    }

    @Then("user navigates to event managment page")
    public void eventPageManagment() {

    }
}
