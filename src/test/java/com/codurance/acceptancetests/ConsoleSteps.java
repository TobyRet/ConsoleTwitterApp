package com.codurance.acceptancetests;

import com.codurance.Console;
import com.codurance.Post;
import com.codurance.Timeline;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ConsoleSteps {

    @Given("^I have a message \"(.*?)\"$")
    public void i_have_a_message(String arg1) throws Throwable {
        String message = "Does anyone like beer?";
    }

    @When("^I post my message$")
    public void i_post_my_message() throws Throwable {
        String message = "Does anyone like beer?";
        Post post = new Post();
        post.execute(message);
    }

    @When("^view my timeline$")
    public void view_my_timeline() throws Throwable {
        Timeline timeline = new Timeline();
        timeline.execute();
    }

    @Then("^I should see \"(.*?)\"$")
    public void i_should_see(String arg1) throws Throwable {
        Console console = new Console();
        console.print("Does anyone like beer?");
    }

}
