package tests;

import base.TestBase;
import pages.DashboardPage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardPageTestCases extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboard;

    public DashboardPageTestCases() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        dashboard = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

    }

    @Test
    public void verifyDashboardTitleTest() {
        String dashboardTitle = dashboard.verifyDashboardTitle();
        Assert.assertEquals(dashboardTitle, "Cogmento CRM", "Your account was created successfully. You are now logged in.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
