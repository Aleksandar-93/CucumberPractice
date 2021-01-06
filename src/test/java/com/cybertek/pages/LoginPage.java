package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//    @FindBy(xpath = " ")
//    public WebElement loginBtn;

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(ConfigurationReader.getProperty("browser")), this);
    }

}
