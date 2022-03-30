package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTable_StepDeff {

    WebTableLoginPage webTableLoginPage= new WebTableLoginPage();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url= ConfigurationReader.getProperty("webTableURL");
        Driver.getDriver().get(url);
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
webTableLoginPage.inputusername.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
webTableLoginPage.inputpassword.sendKeys(string);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
webTableLoginPage.loginButton.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTableLoginPage.login(username,password);
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
webTableLoginPage.inputusername.sendKeys(credentials.get("username"));
webTableLoginPage.inputpassword.sendKeys("password");
webTableLoginPage.loginButton.click();
//we can call method and pass from Map
webTableLoginPage.login(credentials.get("username"), credentials.get("password"));

    }

}
