package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsListPage extends BasePage {

    private final By NEW_ACCOUNT_BUTTON = By.xpath("//div[text()='New']/ancestor::li");

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Account/list");
    }
}
