package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHookStepDef {

    @Given("this is first step")
    public void this_is_first_step() {
        System.out.println("This is the first step");
    }
    @When("this is second step")
    public void this_is_second_step() {
        System.out.println("This is the second step");
    }
    @Then("this is third step")
    public void this_is_third_step() {
        System.out.println("This is the third step");
    }

}
