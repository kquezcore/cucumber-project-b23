package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatStepDef {

    @Given("karina  is hungry")
    public void karina_is_hungry() {
        System.out.println("This is @Given code Karina is hungry");
    }

    @When("she eats {int} cucumbers")
    public void she_eats_cucumbers(Integer quantity) {
        System.out.println("This is @when code she_eats_cucumbers"
        +quantity);
    }

    @Then("she will be full")
    public void she_will_be_full() {
        System.out.println("This is @Then code she_will_be_full");
    }

    @Given("Ivana is hungry")
    public void ivan_is_hungry() {
        System.out.println("@Given ivan is hungry");
    }

    @Then("she faints")
    public void he_faints() {

        System.out.println("@Then she faints code");

    }


}
