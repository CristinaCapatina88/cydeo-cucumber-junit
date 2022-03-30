package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearcg_Page {

public GoogleSearcg_Page(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(name="q")
 public  WebElement searchbox ;

}
