package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private final By HOME_PAGE_BUTTON = By.xpath("//span[text()='Home']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/setup/SetupOneHome/home");
    }

    public void isOpened() {
        waitForPageLoaded();
        wait.until(ExpectedConditions.visibilityOfElementLocated(HOME_PAGE_BUTTON));
    }
}
