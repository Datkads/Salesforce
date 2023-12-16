package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

public class NewAccountPage extends BasePage {

    private final By ACCOUNT_SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Account/new");
    }

    public void isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_SAVE_BUTTON));
    }

    public void createNewAccount(String rating, String accountName, String phone, String fax, String accountNumber,
                                 String website, String accountSite, String tickerSymbol, String type,
                                 String ownership, String industry, String employees, String annualRevenue,
                                 String sicCode, String billingStreet, String billingCity, String billingState,
                                 String billingZip, String billingCountry, String shippingStreet,
                                 String shippingCity, String shippingState, String shippingZip, String shippingCountry,
                                 String customerPriority, String sla, String slaSerialNumber, String numberOfLocations,
                                 String upsellOpportunity, String description) {
        new PickList(driver, "Rating").select(rating);
        new Input(driver, "Account Name").write(accountName + Math.random());
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(tickerSymbol);
        new PickList(driver, "Type").select(type);
        new PickList(driver, "Ownership").select(ownership);
        new PickList(driver, "Industry").select(industry);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "SIC Code").write(sicCode);
        new TextArea(driver, "Billing Street").write(billingStreet);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State/Province").write(billingState);
        new Input(driver, "Billing Zip/Postal Code").write(billingZip);
        new Input(driver, "Billing Country").write(billingCountry);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State/Province").write(shippingState);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZip);
        new Input(driver, "Shipping Country").write(shippingCountry);
        new PickList(driver, "Customer Priority").select(customerPriority);
        new PickList(driver, "SLA").select(sla);
        new Input(driver, "SLA Serial Number").write(slaSerialNumber);
        new Input(driver, "Number of Locations").write(numberOfLocations);
        new PickList(driver, "Upsell Opportunity").select(upsellOpportunity);
        new TextArea(driver, "Description").write(description);
        driver.findElement(ACCOUNT_SAVE_BUTTON).click();
    }
}
