package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should  see fruits i like")
    public void user_should_see_fruits_i_like(List<String> fruit) {
        System.out.println(fruit);
        System.out.println(fruit.get(1));
    }

    @Given("User is on the dropdowns page of practice tool \\(practice in class)")
    public void user_is_on_the_dropdowns_page_of_practice_tool_practice_in_class() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown ");
    }
    @Then("User should see below info in month dropdown\\(practice in class)")
    public void user_should_see_below_info_in_month_dropdown_practice_in_class(List<String> expectedmonths) {

        WebElement monthDropdown = Driver.getDriver().findElement(By.id("month"));
        Select select = new Select(monthDropdown);
//        List<WebElement> elementList = select.getOptions();
//        List<String> listOfmonths= new ArrayList<>();
//        for (WebElement webElement : elementList) {
//            listOfmonths.add(webElement.getText());
//        }
        List<String> actualmonths= BrowserUtils.dropdownOptionsAsString(monthDropdown);
        Assert.assertEquals(actualmonths,expectedmonths);
    }

}
