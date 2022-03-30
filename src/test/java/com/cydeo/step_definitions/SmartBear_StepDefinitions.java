package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBear_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDefinitions {

SmartBear_Page smartBearPage =new SmartBear_Page();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Process.aspx");
smartBearPage.usernamebox.sendKeys("Tester");
smartBearPage.passwordbox.sendKeys("test");
smartBearPage.submitbutton.click();
    }
    @Given("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
     smartBearPage.orderpage.click();
    }

    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select selectobj = new Select(smartBearPage.selectDropdown);
         selectobj.getOptions().get(1).click();
    }
    @And("User enters {string} to quantity")
    public void userEntersToQuantity(String arg0) {
        smartBearPage.quantity.sendKeys(arg0);
    }

    @And("User enters {string} to costumer name")
    public void userEntersToCostumerName(String name) {
        smartBearPage.namebox.sendKeys(name);
    }

    @And("User enters {string} to street")
    public void userEntersToStreet(String arg0) {
        smartBearPage.street.sendKeys(arg0);
    }

    @And("User enters {string} to city")
    public void userEntersToCity(String arg0) {
        smartBearPage.city.sendKeys(arg0);
    }

    @And("User enters {string} to state")
    public void userEntersToState(String arg0) {
        smartBearPage.state.sendKeys(arg0);
    }

    @And("User enters {string} to zipcode")
    public void userEnters(String arg0) {
        smartBearPage.zipCode.sendKeys(arg0);
    }

    @And("User selects {string} as card type")
    public void userSelectsAsCardType(String arg0) {
        smartBearPage.visaradiobutton.click();
    }

    @And("User enters {string} to card number")
    public void userEntersToCardNumber(String arg0) {
        smartBearPage.cardnumber.sendKeys(arg0);
    }

    @And("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String arg0) {
        smartBearPage.expirationDate.sendKeys(arg0);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
     smartBearPage.processButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String name) {
        smartBearPage.viewAllOrderButton.click();
        Assert.assertTrue("Name is not the same ",smartBearPage.nameOnViewAllOrders.getText().contains(name));


    }


    @When("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String product) {
        Select selectobj = new Select(smartBearPage.selectDropdown);
        selectobj.selectByValue(product);
    }
}
