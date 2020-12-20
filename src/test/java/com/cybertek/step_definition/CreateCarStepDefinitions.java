package com.cybertek.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {

//    @Given("user is on the landing page")
//    public void user_is_on_the_landing_page() {
//
//
//    }



    @When("user logs in with {string} and {string} credentials")
    public void user_logs_in_with_and_credentials(String string, String string2) {
        System.out.printf("User navigate to %s tab and %s module", string, string2);
    }
//    @Then("user navigate to {string} and {string}")
//    public void user_navigate_to_and(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @Then("user click on create a car button")
    public void user_click_on_create_a_car_button() {
        System.out.println("User click on the create button");
    }
    @Then("user enter vehicles information:")
    public void user_enter_vehicles_information(List<Map<String, String>> dataTable) {
//        dataTable.forEach(p -> System.out.println(p));  PRINT ALL FROM OUR LIST....
        System.out.println("Driver: "+dataTable.get(0).get("Driver")); //ROW 1 Get D    river
        System.out.println("Driver: "+dataTable.get(0).get("Location")); //ROW 1 Get Location

    }
}
