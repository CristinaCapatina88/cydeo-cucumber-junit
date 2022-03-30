package com.cydeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// about:blank
public class SeamnlessLoginPage {
    // No page elements added

    public SeamnlessLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}