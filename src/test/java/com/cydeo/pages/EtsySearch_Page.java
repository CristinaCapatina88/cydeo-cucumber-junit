package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearch_Page {

    public EtsySearch_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="global-enhancements-search-query")
    public WebElement searchbox;

@FindBy(xpath = "(//button[@type='submit'])[1]")
public WebElement submittbutton;


}
