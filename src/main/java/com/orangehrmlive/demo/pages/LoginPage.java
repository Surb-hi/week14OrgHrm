package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement  username;

    public void setUsername(String username1){
        Reporter.log("Enter username "+username1 + "to username field "+ username.toString() + "<br>");
        sendTextToElement(username,username1);
    }

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;

    public void setPassword(String password1){
        Reporter.log("Enter password"+password1 + " to password  field "+ password.toString() + "<br>");
        sendTextToElement(password,password1);
    }

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement LoginButton;

    public void setLoginButton(){
        Reporter.log("Clicking on LoginButton"+ LoginButton.toString()+ "<br>");

        clickOnElement(LoginButton);
    }

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement LOGINPaneltext ;

    public String VerifyLoginPanelText() {
        Reporter.log("getting  text from LOGINPaneltext"+LOGINPaneltext.toString()+"<br>");
        return getTextFromElement(LOGINPaneltext);
    }






}
