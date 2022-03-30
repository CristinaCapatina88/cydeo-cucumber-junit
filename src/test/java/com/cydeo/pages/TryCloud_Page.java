package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TryCloud_Page {

    public TryCloud_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "user")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement submitButton;

    @FindBy (xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement fileButton;

    @FindBy (xpath = "//*[text()='Favorites']")
    public WebElement favoritesButton;

    @FindBy (xpath = "//a[@data-action='menu']")
    public List<WebElement> iconMore;

    @FindBy (xpath = "//span[.='Remove from favorites']")
    public WebElement removefavorites;

    @FindBy (xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy (xpath = "//span[.='Upload file']")
    public WebElement uploadFile;

    @FindBy (xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileIgor;

    @FindBy (xpath = "//span[@class='innernametext']")
    public List<WebElement> filesNames;

    @FindBy (xpath = "//tr[@data-favorite='true']")
    public List<WebElement> favoriteFiles;

    @FindBy(xpath = "//a[@data-action='Favorite']//span[1]")
    public WebElement starFavoriteIcon;


}
