package com.codurance.acceptancetests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConsoleSteps {

    @Given("^I have a message \"(.*?)\"$")
    public void i_have_a_message(String arg1) throws Throwable {
    }

    @When("^I post my message$")
    public void i_post_my_message() throws Throwable {
    }

    @When("^view my timeline$")
    public void view_my_timeline() throws Throwable {
    }

    @Then("^I should see \"(.*?)\"$")
    public void i_should_see(String arg1) throws Throwable {
    }

}
