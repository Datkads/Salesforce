package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsListPage extends BasePage {

    private final By NEW_ACCOUNT_BUTTON = By.xpath("//div[text()='New']/ancestor::li");

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Account/list");
    }

    public void isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_ACCOUNT_BUTTON));
    }
}
