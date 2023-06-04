package tmcartStepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tmcart_pages.page_navigation;
import tmcart_pages.registerpage;

import java.io.IOException;

public class loginSteps {



        @Then("User can successfully create a new account by  navigating to the Home page")
    public void userCanSuccessfullyCreateANewAccountByNavigatingToTheHomePage() {
       // registerpage.userSucessfully_registered();
    }




    @Given("i am in the register page of the  application")
    public void iAmInTheRegisterPageOfTheApplication() throws IOException {
        page_navigation.site_navigation();
    }

    @When("User should be able to create an account by Enter the details and click on the Register Button")
    public void userShouldBeAbleToCreateAnAccountByEnterTheDetailsAndClickOnTheRegisterButtonEnteringTheDetailsAndClickOnTheRegisterButton() throws InterruptedException {
        registerpage.userRegistration();
    }
}

