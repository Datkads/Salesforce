package tests;

import dto.Account;
import dto.Contact;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import utils.PropertyReader;

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
    String user;
    String password;

    Account accountBuilder = Account.builder()
            .rating("Cold")
            .accountName("David Test")
            .phone("7-977-970-41-78")
            .fax("7-977-970-41-78")
            .accountNumber("123")
            .website("teachmeskills.by")
            .accountSite("teachmeskills.by")
            .tickerSymbol("123")
            .type("Prospect")
            .ownership("Public")
            .industry("Banking")
            .employees("1")
            .annualRevenue("1")
            .sicCode("123")
            .billingStreet("Blabla Street 123")
            .billingCity("Blabla City")
            .billingState("Blabla State")
            .billingZip("123")
            .billingCountry("Blabla")
            .shippingStreet("OchenMnogoTeksta")
            .shippingCity("EasterEgg")
            .shippingState("blabla")
            .shippingZip("123")
            .shippingCountry("Blabla")
            .customerPriority("High")
            .sla("Gold")
            .slaSerialNumber("123")
            .numberOfLocations("1")
            .upsellOpportunity("Yes")
            .description("Mda")
            .build();

    Contact contactBuilder = Contact.builder()
            .phone("7-977-970-41-78")
            .homePhone("7-977-970-41-78")
            .salutation("Mr.")
            .firstName("David")
            .lastName("Gelenidze")
            .mobile("7-977-970-41-78")
            .title("Sir")
            .otherPhone("123123")
            .department("FBI")
            .fax("123123")
            .birthDate("06/06/2000")
            .email("blabla@gmail.com")
            .assistant("Mrs. Ktoto")
            .leadSource("Web")
            .asstPhone("123123")
            .momsEmail("mom@gmail.com")
            .mailingStreet("Some Street 123")
            .mailingCity("City")
            .mailingState("State")
            .mailingZip("123123")
            .mailingCountry("Country")
            .otherStreet("Street 123")
            .otherCity("City")
            .otherState("State")
            .otherZip("123123")
            .otherCountry("Country")
            .languages("Chinese")
            .level("Primary")
            .description("Delovoy chelovek")
            .build();

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

        user = System.getProperty("user", PropertyReader.getProperty("sf.user"));
        System.out.println(user);
        password = System.getProperty("password", PropertyReader.getProperty("sf.password"));
        System.out.println(password);
    }

    @AfterMethod(alwaysRun = true, description = "Browser shutdown")
    public void tearDown() {
        driver.quit();
    }
}
