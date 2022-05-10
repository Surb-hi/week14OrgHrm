package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement SystemUsersText;

    public String VerifySystemUsersText() {
        Reporter.log("getting  text from SystemUsersText "+SystemUsersText.toString()+"<br>");
        return getTextFromElement(SystemUsersText);
    }

    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement UsernameField;

    public void setUsernameField(String username) {
        Reporter.log("Enter UsernameField "+username+ " to UsernameField field "+UsernameField .toString() + "<br>");
        sendTextToElement(UsernameField,username);
    }

    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement UserRolldropDown;

    public void setUserRolldropDown(String rolldropDown) {
        Reporter.log("Selecting UserRolldropDown "+rolldropDown +" from dropdown "+UserRolldropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(UserRolldropDown, rolldropDown);
    }

    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement EmployeeNameField;

    public void setEmployeeNameField(String name) {
        Reporter.log("Enter EmployeeNameField"+EmployeeNameField + " to EmployeeNameField  field "+ name.toString() + "<br>");
        sendTextToElement(EmployeeNameField);
    }

    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement StatusDropDown;

    public void setStatusDropDown(String dropDown) {
        Reporter.log("Selecting StatusDropDown"+dropDown +" from dropdown "+StatusDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(StatusDropDown, dropDown);
    }

    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement SearchButton;

    public void ClickOnSearchButton() {
        Reporter.log("Clicking on SearchButton"+ SearchButton.toString()+ "<br>");

        clickOnElement(SearchButton);
    }

    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement ResetButton;

    public void ClickOnResetButton() {
        Reporter.log("Clicking on ResetButton "+ ResetButton.toString()+ "<br>");

        clickOnElement(ResetButton);
    }

    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement AddButton;

    public void ClickOnAddButton() {
        Reporter.log("Clicking on AddButton"+ AddButton.toString()+ "<br>");

        clickOnElement(AddButton);
    }

    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement DeleteButton;

    public void ClickOnDeleteButton() {
        Reporter.log("Clicking on DeleteButton "+ DeleteButton.toString()+ "<br>");

        clickOnElement(DeleteButton);
    }

    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement NoRecordsFoundMsg;

    public String VerifyNoRecordFound() {
        Reporter.log("getting  text from NoRecordsFoundMsg"+NoRecordsFoundMsg.toString()+"<br>");
        return getTextFromElement(NoRecordsFoundMsg);
    }

    @FindBy(xpath = "//input[@id='ohrmList_chkSelectRecord_46']")
    WebElement checkBox;

    public void clickOncheckBox(){

        Reporter.log("Clicking on checkBox"+checkBox.toString()+ "<br>");
        clickOnElement(checkBox);
    }
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement PopUp;

    public void clickOnPopPOp(){
        Reporter.log("Clicking on PopUp "+ PopUp.toString()+ "<br>");

        clickOnElement(PopUp);
    }
}
