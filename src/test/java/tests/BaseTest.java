package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod(description = "Browser settings setup")
    public void setup(@Optional("chrome") String browser, ITestContext testContext) {
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);
            //driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("headless");
            driver = new EdgeDriver(options);
            //driver.manage().window().maximize();
        }
        testContext.setAttribute("chrome", driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod(alwaysRun = true, description = "Browser shutdown")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
