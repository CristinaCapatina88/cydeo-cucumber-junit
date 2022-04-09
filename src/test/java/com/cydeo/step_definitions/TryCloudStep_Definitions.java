package com.cydeo.step_definitions;

import com.cydeo.pages.TryCloud_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class TryCloudStep_Definitions {
TryCloud_Page tryCloudPage= new TryCloud_Page();
   int i = 0;
    String filenameWithStar;

    @Given("user enters {string} and {string} in the log in page")
    public void user_enters_and_in_he_log_in_page(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("tryCloudURL"));
        tryCloudPage.userNameInput.sendKeys(username);
        tryCloudPage.passwordInput.sendKeys(password);
        tryCloudPage.submitButton.click();
        BrowserUtils.waitForPageToLoad(5);
    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {
      tryCloudPage.fileButton.click();

    }
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
      tryCloudPage.addIcon.click();
    }
    @And("users uploads {string} with the upload file option")
    public void usersUploadsWithTheUploadFileOption(String file) {
//        tryCloudPage.uploadFile.click();
//        Robot rb= new Robot();
//        StringSelection str = new StringSelection(file);
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//        rb.keyPress(KeyEvent.VK_CONTROL);
//        rb.keyPress(KeyEvent.VK_V);
//        rb.keyRelease(KeyEvent.VK_CONTROL);
//        rb.keyRelease(KeyEvent.VK_V);
//        rb.keyPress(KeyEvent.VK_ENTER);
//        rb.keyRelease(KeyEvent.VK_ENTER);

        tryCloudPage.uploadFileIgor.sendKeys(file);
        BrowserUtils.sleep(3);
    }

    @Then("verify the {string} is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page(String fileName) {
       List<String> actualFilesNames= new ArrayList<>();
       tryCloudPage.filesNames.forEach(p-> actualFilesNames.add(p.getText()));
        System.out.println("Recent file name uploaded to Files: " + fileName);
        Assert.assertTrue(actualFilesNames.contains(fileName));
    }


    @When("the users click action-icon from any file on the page to remove")
    public void theUsersClickActionIconFromAnyFileOnThePageToRemove() {
        for (WebElement each : tryCloudPage.iconMore) {
            each.click();
            if(tryCloudPage.starFavoriteIcon.getAttribute("class").endsWith("dark"))
                break;
            i++;

            }
        filenameWithStar= tryCloudPage.filesNames.get(i).getText();
        }



    @And("user choose the Remove from favorites option")
    public void userChooseTheRemoveFromFavoritesOption() {
        tryCloudPage.removefavorites.click();

    }

    @And("user click the Favorites sub-module on the left side")
    public void userClickTheFavoritesSubModuleOnTheLeftSide() {
        tryCloudPage.favoritesButton.click();
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verifyThatTheFileIsRemovedFromTheFavoritesSubModuleSTable() {
        List<String> actualFavoriteFileNames = new ArrayList<>();
       tryCloudPage.filesNames.forEach(p -> actualFavoriteFileNames.add(p.getText()));
        System.out.println("Recent file name deleted from Favorite: " + filenameWithStar);
        Assert.assertFalse(actualFavoriteFileNames.contains(filenameWithStar));

    }
}
