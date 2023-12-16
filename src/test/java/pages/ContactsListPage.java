package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsListPage extends BasePage {

    private final By NEW_CONTACT_BUTTON = By.xpath("//div[text()='New']/ancestor::li");

    public ContactsListPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Contact/list");
    }

    public void isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_CONTACT_BUTTON));
    }
}
