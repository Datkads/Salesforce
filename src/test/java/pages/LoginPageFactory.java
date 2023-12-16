package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageFactory extends BasePage {
    @FindBy(id = "username")
    WebElement userNameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "Login")
    WebElement loginButton;

    LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL);
        PageFactory.initElements(driver, this);
    }

    public void isOpened() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
    }

    public void login(String username, String password) {
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
