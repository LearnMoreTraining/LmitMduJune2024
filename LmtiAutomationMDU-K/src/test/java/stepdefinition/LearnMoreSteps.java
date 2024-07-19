package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ht.Le;
import utility.TestContext;

public class LearnMoreSteps {
    TestContext context;
    public LearnMoreSteps(TestContext context){
        this.context = context;
    }
    
    @Given("user clicks the confirm box")
    public void confirmBox(){
        context.pageObjectManager.getAlertPage().clickConfirmBoxButton();
    }

    @And("user get confirm box text")
    public void userGetConfirmBoxText() {
      String text=  context.pageObjectManager.getAlertPage().getConfirmBoxText();
        System.out.println(text);
    }

    @When("user clicks on cancel button")
    public void userClicksOnCancelButton() {
        context.pageObjectManager.getAlertPage().clickCancelButton();
    }

    @Then("verify the UI text")
    public void verifyTheUIText() {
       String message = context.pageObjectManager.getAlertPage().getUiText();
        System.out.println(message);
    }
}
