package co.com.choucair.certification.retoutest.stepdefinitions;

import co.com.choucair.certification.retoutest.model.User;
import co.com.choucair.certification.retoutest.tasks.Fill;
import co.com.choucair.certification.retoutest.tasks.GoTo;
import co.com.choucair.certification.retoutest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Rose want to subscribe to the uTest platform$")
    public void thatRoseWantToSubscribeToTheUTestPlatform() {

        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), GoTo.theForm());

    }

    @When("^she fill out the registration form$")
    public void sheFillOutTheRegistrationForm(List<User> user)  {

        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theForm(user.get(0)));

    }

    @Then("^finds the message called The Last Step$")
    public void findsTheMessageCalledTheLastStep() {

    }





}
