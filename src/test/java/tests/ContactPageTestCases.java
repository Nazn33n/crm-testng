package tests;

import base.TestBase;
import model.ContactParam;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContactDetail;
import pages.ContactPage;
import pages.DashboardPage;
import pages.LoginPage;

public class ContactPageTestCases extends TestBase {
    ContactPage contactPage;
    ContactDetail contactDetail;
    DashboardPage dashboard;

    public ContactPageTestCases() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        contactPage = new ContactPage();
        LoginPage loginPage = new LoginPage();
        dashboard = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void contactPageTest() {
        ContactParam contactParam = ContactParam.builder()
                .firstName(prop.getProperty("firstName"))
                .middleName(prop.getProperty("middleName"))
                .lastName(prop.getProperty("lastName"))
                .addressDetail(prop.getProperty("addressDetail"))
                .cityName(prop.getProperty("cityName"))
                .stateName(prop.getProperty("stateName"))
                .zipCode(prop.getProperty("zipCode"))
                .build();
        contactPage.contactCreate(contactParam);

        contactDetail = new ContactDetail();
        contactDetail.saveDetails(contactParam);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
