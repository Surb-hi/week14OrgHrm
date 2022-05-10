package com.orangehrmlive.demo.testsuits;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsersTest extends TestBase {
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
    public void adminShouldAddUserSuccessFully() {

        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();
        homePage.ClickOnAdmin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.VerifySystemUsersText(), "System Users", "");
        softAssert.assertAll();
        viewSystemUsersPage.ClickOnAddButton();
        SoftAssert softAssert2 = new SoftAssert();
        softAssert.assertEquals(addUserPage.verifyAddUserText(), "Add User", "");
        softAssert.assertAll();
        addUserPage.setUserRoleDropDown("Admin");
        addUserPage.setEmployeeName("Ananya Dash");
        addUserPage.setUsername("surbhi123456");
        addUserPage.setStatusDropDown("Disabled");
        addUserPage.setPassword("tandel1234");
        addUserPage.setConfirmPassword("tandel1234");
        addUserPage.ClickOnSaveButton();
        /*SoftAssert softAssert3=new SoftAssert();
        softAssert.assertEquals(addUserPage.,"Successfully Saved","");
        softAssert.assertAll();*/
    }

    @Test(groups = {"smoke","regression"})
    public void searchTheUserCreatedAndVerifyIt() {
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();
        homePage.ClickOnAdmin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.VerifySystemUsersText(), "System Users", "");
        softAssert.assertAll();
        viewSystemUsersPage.setUsernameField("adash");
        viewSystemUsersPage.setUserRolldropDown("ESS");
        viewSystemUsersPage.setStatusDropDown("Enabled");
        viewSystemUsersPage.ClickOnSearchButton();
    }

    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();
        homePage.ClickOnAdmin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.VerifySystemUsersText(), "System Users", "");
        softAssert.assertAll();
        viewSystemUsersPage.setUsernameField("adash");
        viewSystemUsersPage.setUserRolldropDown("ESS");
        viewSystemUsersPage.setStatusDropDown("Enabled");
        viewSystemUsersPage.ClickOnSearchButton();
        viewSystemUsersPage.clickOncheckBox();
        viewSystemUsersPage.ClickOnDeleteButton();
        viewSystemUsersPage.clickOnPopPOp();

    }

    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();
        homePage.ClickOnAdmin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.VerifySystemUsersText(), "System Users", "");
        softAssert.assertAll();
        viewSystemUsersPage.setUsernameField("surbhi1234");
        viewSystemUsersPage.setUserRolldropDown("Admin");
        viewSystemUsersPage.setStatusDropDown("All");
        viewSystemUsersPage.ClickOnSearchButton();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.VerifyNoRecordFound(), "No Records Found", "");
        softAssert.assertAll();
    }
}
