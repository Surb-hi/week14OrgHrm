package com.orangehrmlive.demo.testsuits;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    AddUserPage addUserPage;
    AdminPage adminPage;
    DashboardPage dashboardPage;
    HomePage homePage;
    LoginPage loginPage;
    ViewSystemUsersPage viewSystemUsersPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        addUserPage = new AddUserPage();
        adminPage = new AdminPage();
        dashboardPage = new DashboardPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        viewSystemUsersPage = new ViewSystemUsersPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.VerifywelcomeText(), "Welcome", "");
        softAssert.assertAll();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatTheLogoDisplayOnHomePage(){
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();
        /*SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.ClickOnOrangeHrmLogo(), "OrangeHRM", "");
        softAssert.assertAll();*/
    }
    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully(){
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();
        homePage.clickOnUserProfile();
        homePage.clickOnLogOutButton();
        loginPage.VerifyLoginPanelText();
    }
}