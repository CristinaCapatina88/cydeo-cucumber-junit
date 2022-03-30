package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name ="username")
    public WebElement inputusername;

    @FindBy(name ="password")
    public WebElement inputpassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


    /**
     * No parameters
     * When we call this method it will directly login using
     * Username:Test
     * Password:Tester
     */
    public void login(){
this.inputusername.sendKeys("Test");
this.inputpassword.sendKeys("Tester");
this.loginButton.click();
}

    /**
     *
     * @param username
     * @param password
     */
    public void login(String username, String password){
       inputusername.sendKeys(username);
   inputpassword.sendKeys(password);
   loginButton.click();
}

    /**
     * This method wll login using credentials from conf .properties
     */
    public void loginWithConfig(){
inputusername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
inputpassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
loginButton.click();
}

}
