package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyReader;

import java.time.Duration;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    final String BASE_URL = PropertyReader.getProperty("sf.base.page");

    BasePage(WebDriver chrome) {
        this.driver = chrome;
        wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
    }
}
