package pages;

import base.TestBase;
import model.ContactParam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends TestBase {

    public void setUp() {
        PageFactory.initElements(driver, this);
    }

    public void clickMenu() {
        WebElement mainMenu = driver.findElement(By.xpath("//div[@id='main-nav']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//div[@id='main-nav']//div[3]"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

    }

    public void createButton() {
        WebElement cButton = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(cButton);
        actions.click().build().perform();
    }

    public void contactCreate(ContactParam contactParam) {
        clickMenu();
        createButton();
    }

}
