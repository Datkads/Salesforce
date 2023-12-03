package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountsListPage accountsListPage;
    NewAccountPage newAccountPage;
    ContactsListPage contactsListPage;
    NewContactPage newContactPage;


    @Parameters({"browser"})
    @BeforeMethod(description = "Browser settings setup")
    public void setup(@Optional("chrome") String browser, ITestContext testContext) {
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        testContext.setAttribute("chrome", driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountsListPage = new AccountsListPage(driver);
        newAccountPage = new NewAccountPage(driver);
        contactsListPage = new ContactsListPage(driver);
        newContactPage = new NewContactPage(driver);
    }

    @AfterMethod(alwaysRun = true, description = "Browser shutdown")
    public void tearDown() {
        driver.quit();
    }
}
