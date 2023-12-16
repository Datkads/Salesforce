package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    final String BASE_URL = "https://tms41-dev-ed.my.salesforce.com/";

    BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
}
