package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement OrangeHRMlogo;

    public String ClickOnOrangeHrmLogo (){
        Reporter.log("Clicking on OrangeHRMlogo "+ OrangeHRMlogo.toString()+ "<br>");
        return getTextFromElement (OrangeHRMlogo);
    }

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement Admin;

    public void ClickOnAdmin(){
        Reporter.log("Clicking on Admin "+ Admin.toString()+ "<br>");
        clickOnElement(Admin);
    }

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement PIM;

    public void ClickOnPIM(){
        Reporter.log("Clicking on PIM "+ PIM.toString()+ "<br>");
        clickOnElement(PIM);
    }

    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement Leave;

    public void ClickOnLeave(){
        Reporter.log("Clicking on Leave"+ Leave.toString()+ "<br>");
        clickOnElement(Leave);
    }

    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement Dashboard;

    public void ClickOnDashBoard (){
        Reporter.log("Clicking on Dashboard"+ Dashboard.toString()+ "<br>");
        clickOnElement(Dashboard);
    }

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement  WelcomeText;

    public String VerifywelcomeText() {
        Reporter.log("getting  text from WelcomeText "+WelcomeText.toString()+"<br>");
        return getTextFromElement(WelcomeText).substring(0,7);
    }

    @FindBy (xpath = "//a[@id='welcome']")
    WebElement userprofile;

    public void clickOnUserProfile(){
        Reporter.log("Clicking on userprofile"+ userprofile.toString()+ "<br>");
        clickOnElement(userprofile);
    }

    @FindBy (xpath = "//a[contains(text(),'Logout')]")
    WebElement LogOutButton;

    public void clickOnLogOutButton(){
        Reporter.log("Clicking on LogOutButton"+ LogOutButton.toString()+ "<br>");
        clickOnElement(LogOutButton);
    }

}

