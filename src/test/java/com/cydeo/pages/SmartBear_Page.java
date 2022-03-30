package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBear_Page {

    public SmartBear_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="ctl00$MainContent$username")
    public WebElement usernamebox;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordbox;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement submitbutton;

    @FindBy(linkText = "Order")
    public WebElement orderpage;

    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
public WebElement selectDropdown;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
public WebElement quantity;

    @FindBy(name="ctl00$MainContent$fmwOrder$txtName")
    public WebElement namebox;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement street;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement city;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement state;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@type='radio'][1]")
    public WebElement visaradiobutton;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardnumber;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrderButton;

    @FindBy(xpath = "//tbody//tr[2]//td[2]")
  public WebElement nameOnViewAllOrders;


}
