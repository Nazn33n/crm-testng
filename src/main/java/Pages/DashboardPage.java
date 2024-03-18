package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends TestBase {
    @FindBy(xpath = "//b[text()='Zobby's Fashion House'])")
    WebElement userNameLabel;
    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
    public String verifyDashboardTitle(){
        return driver.getTitle();
    }
}
