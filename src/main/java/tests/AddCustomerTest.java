package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerTest extends PageProvider {
    @When("^I type first name as (.+), last name as (.+), post code as (.+)$")
    public void inputUserInformation(String firstname, String lastname, String postcode) throws Throwable {
        Thread.sleep(3000);
        getAddCustomerPage().getInformationCustomer(firstname,lastname,postcode);
    }
    @And("^I click submit$")
    public void i_click_submit() throws Throwable {
        Thread.sleep(3000);
        getAddCustomerPage().clickSummit();
    }
    @Then("^I verify that system is already added customer as (.+) successfully$")
    public void verifyCustomerAddSuccessfully() throws InterruptedException {


    }




}
