package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {
public AdminPage() {
    PageFactory.initElements(driver, this);
}   @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement UserManagement;

    public void ClickOnUserManagement (){
        Reporter.log("Clicking on UserManagement"+ UserManagement.toString()+ "<br>");
        clickOnElement(UserManagement);
    }

    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement Job;

    public void ClickOnJob(){
        Reporter.log("Clicking on Job"+ Job.toString()+ "<br>");
        clickOnElement(Job);
    }


    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement Organization;

    public void ClickOnOrganization (){
        Reporter.log("Clicking on Organization"+ Organization.toString()+ "<br>");
        clickOnElement(Organization);
    }

}
