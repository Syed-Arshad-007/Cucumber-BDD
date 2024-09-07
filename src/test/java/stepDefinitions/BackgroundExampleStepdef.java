package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExampleStepdef {

    @Given("The student finished high school")
    public void the_student_finished_high_school() {
        System.out.println("The student finished high school");
    }

    @Given("The finished higher secondary")
    public void the_finished_higher_secondary() {
        System.out.println("The finished higher secondary");
    }

    @Given("the student applied for the medical course")
    public void the_student_applied_for_the_medical_course() {
        System.out.println("the student applied for the medical course");
    }

    @When("the cleared entrance exam")
    public void the_cleared_entrance_exam() {
        System.out.println("the cleared entrance exam");
    }

    @Then("the student is eligible for joining any Medical institute")
    public void the_student_is_eligible_for_joining_any_medical_institute() {
        System.out.println("the student is eligible for joining any Medical institute");

    }

    @Given("the student applied for the Engineering course")
    public void the_student_applied_for_the_Engineering_course() {
        System.out.println("the student applied for the Engineering course");
    }

    @When("the student has sayable cut off")
    public void the_cleared_has_sayable_cutoff() {
        System.out.println("the student has sayable cutoff");
    }

    @Then("the student is eligible for joining any Engineering institute")
    public void the_student_is_eligible_for_joining_any_Engineering_institute() {
        System.out.println("the student is eligible for joining any Engineering institute");

    }
}