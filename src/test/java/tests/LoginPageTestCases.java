package tests;

import base.TestBase;
import pages.DashboardPage;
import pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTestCases extends TestBase {
    LoginPage loginPage;
    DashboardPage dashboard;

    public LoginPageTestCases() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void loginTest() {

        dashboard = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
