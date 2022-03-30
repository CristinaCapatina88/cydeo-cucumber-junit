package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearch_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinitions {

EtsySearch_Page etsySearch_page= new EtsySearch_Page();

    @Given("user in on home page")
    public void user_in_on_home_page() {
        Driver.getDriver().get("https://www.etsy.com ");
    }

    @Then("user sees title as expected")
    public void user_sees_title_as_expected() {
  Assert.assertTrue("Title is not matching" , Driver.getDriver().getTitle().equals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
    }

    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
       etsySearch_page.searchbox.sendKeys("Wooden Spoon");

    }
    @And("User clicks search button")
    public void userClicksSearchButton() {
        etsySearch_page.submittbutton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue("Title is not matching" ,Driver.getDriver().getTitle().equals("Wooden spoon | Etsy"));
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String string) {
        etsySearch_page.searchbox.sendKeys(string);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String string) {
        Assert.assertTrue("Title is not matching" ,Driver.getDriver().getTitle().contains(string));
    }
}
