package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DashboardPage extends Utility {
    public DashboardPage(){

            PageFactory.initElements(driver, this);
        }
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement Dashboardtext;

    public String VerifyDashboaredText() {

        Reporter.log("getting  text from Dashboardtext"+Dashboardtext.toString()+"<br>");
        return getTextFromElement(Dashboardtext);
    }




}

