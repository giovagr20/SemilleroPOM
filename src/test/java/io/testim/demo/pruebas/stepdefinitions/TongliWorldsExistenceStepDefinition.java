package io.testim.demo.pruebas.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.testim.demo.pruebas.models.TongliModel;
import io.testim.demo.pruebas.steps.TongliSteps;
import net.thucydides.core.annotations.Steps;

public class TongliWorldsExistenceStepDefinition {

    @Steps
    TongliSteps tongli;
    TongliModel tongliModel = new TongliModel();

    @Given("^the user opens navigator$")
    public void theUserOpensNavigator() {
        tongli.openBrowser();
        tongli.verifyTextSpaceAdvisor();

    }

    @When("^the user enters text of your next destination$")
    public void theUserEntersTextOfYourNextDestination() {
        tongliModel.setNumberAdults("2");
        tongli.selectAdults(tongliModel.getNumberAdults());
        tongli.selectChildren();
    }

    @Then("^verify tongli world$")
    public void verifyTongliWorld() {
    }



}
