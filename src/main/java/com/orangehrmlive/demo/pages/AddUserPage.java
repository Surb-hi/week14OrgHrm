package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUserPage extends Utility {

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement AddUserText;
    public String verifyAddUserText(){
        Reporter.log("getting  text from AddUserText"+AddUserText.toString()+"<br>");
        return getTextFromElement(AddUserText);
    }


    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement UserRoleDropDown;
    public void setUserRoleDropDown(String userRoleDropDown1) {
        Reporter.log("Selecting UserRoleDropDown"+userRoleDropDown1 +" from dropdown "+UserRoleDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(UserRoleDropDown, userRoleDropDown1);
    }


    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement EmployeeName;
    public void setEmployeeName(String name) {
        Reporter.log("Enter EmployeeName"+name + " EmployeeName to  field "+ EmployeeName.toString() + "<br>");
        sendTextToElement(EmployeeName,name);
    }



    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement Username;
    public void setUsername(String Name) {
        Reporter.log("Enter Username"+Name + " Username to field "+ Username.toString() + "<br>");
        sendTextToElement(Username,Name);
    }



    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement StatusDropDown;
    public void setStatusDropDown(String statusDropDown) {
        Reporter.log("Selecting StatusDropDown "+statusDropDown+" StatusDropDown from dropdown"+StatusDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(StatusDropDown, statusDropDown);
    }



    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement Password;
    public void setPassword(String word) {
        Reporter.log("Enter Password "+word+ " Password to  field "+ Password.toString() + "<br>");
        sendTextToElement(Password,word);
    }



    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement ConfirmPassword;
    public void setConfirmPassword(String paasword) {
        Reporter.log("Enter ConfirmPassword"+ paasword+ "ConfirmPassword to  field "+ ConfirmPassword.toString() + "<br>");
        sendTextToElement(ConfirmPassword,paasword);
    }



    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement SaveButton;
    public void ClickOnSaveButton() {

        Reporter.log("Clicking on SaveButton"+ SaveButton.toString()+ "<br>");
        clickOnElement(SaveButton);
    }



    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement CancleButton;
    public void ClickOnCancleButton() {

        Reporter.log("Clicking on CancleButton"+ CancleButton.toString()+ "<br>");
        clickOnElement(CancleButton);
    }
}
