package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public void createNewAccount(String AccountName, String Phone, String Fax, String AccountNumber,
                                 String Website, String AccountSite, String TickerSymbol, String Type,
                                 String Ownership, String Industry, String Employees, String AnnualRevenue,
                                 String SICCode, String BillingStreet, String BillingCity, String BillingState,
                                 String BillingZip, String BillingCountry, String ShippingStreet,
                                 String ShippingCity, String ShippingState, String ShippingZip, String ShippingCountry,
                                 String CustomerPriority, String SLA, String SLASerialNumber, String NumberOfLocations,
                                 String UpsellOpportunity, String Description) {
        new Input(driver, "Account Name").write(AccountName + Math.random());
        new Input(driver, "Phone").write(Phone);
        new Input(driver, "Fax").write(Fax);
        new Input(driver, "Account Number").write(AccountNumber);
        new Input(driver, "Website").write(Website);
        new Input(driver, "Account Site").write(AccountSite);
        new Input(driver, "Ticker Symbol").write(TickerSymbol);
        new PickList(driver, "Type").select(Type);
        new PickList(driver, "Ownership").select(Ownership);
        new PickList(driver, "Industry").select(Industry);
        new Input(driver, "Employees").write(Employees);
        new Input(driver, "Annual Revenue").write(AnnualRevenue);
        new Input(driver, "SIC Code").write(SICCode);
        new TextArea(driver, "Billing Street").write(BillingStreet);
        new Input(driver, "Billing City").write(BillingCity);
        new Input(driver, "Billing State/Province").write(BillingState);
        new Input(driver, "Billing Zip/Postal Code").write(BillingZip);
        new Input(driver, "Billing Country").write(BillingCountry);
        new TextArea(driver, "Shipping Street").write(ShippingStreet);
        new Input(driver, "Shipping City").write(ShippingCity);
        new Input(driver, "Shipping State/Province").write(ShippingState);
        new Input(driver, "Shipping Zip/Postal Code").write(ShippingZip);
        new Input(driver, "Shipping Country").write(ShippingCountry);
        new PickList(driver, "Customer Priority").select(CustomerPriority);
        new PickList(driver, "SLA").select(SLA);
        new Input(driver, "SLA Serial Number").write(SLASerialNumber);
        new Input(driver, "Number of Locations").write(NumberOfLocations);
        new PickList(driver, "Upsell Opportunity").select(UpsellOpportunity);
        new TextArea(driver, "Description").write(Description);
        driver.findElement(ACCOUNT_SAVE_BUTTON).click();
    }
}
