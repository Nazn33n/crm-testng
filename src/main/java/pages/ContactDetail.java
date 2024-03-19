package pages;

import base.TestBase;
import model.ContactParam;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetail extends TestBase {

    @FindBy(name = "first_name")
    WebElement firstName;
    @FindBy(name = "last_name")
    WebElement lastName;
    @FindBy(name = "middle_name")
    WebElement middleName;
    @FindBy(name = "address")
    WebElement addressDetail;
    @FindBy(name = "city")
    WebElement cityName;
    @FindBy(name = "state")
    WebElement stateName;
    @FindBy(name = "zip")
    WebElement zipCode;
    @FindBy(xpath = "//button[@class= 'ui linkedin button' and text()='Save']")
    WebElement saveButton;

    public ContactDetail() {
        PageFactory.initElements(driver, this);
    }

    public void saveDetails(ContactParam contactParam) {
        firstName.sendKeys(contactParam.getFirstName());
        middleName.sendKeys(contactParam.getMiddleName());
        lastName.sendKeys(contactParam.getLastName());
        addressDetail.sendKeys(contactParam.getAddressDetail());
        cityName.sendKeys(contactParam.getCityName());
        stateName.sendKeys(contactParam.getStateName());
        zipCode.sendKeys(contactParam.getZipCode());
        saveButton.click();
    }
}
