package pages;

import dto.Account;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

@Log4j2
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

    @Step("Creating account: '{accountName}'")
    public void createNewAccount(String rating, String accountName, String phone, String fax, String accountNumber,
                                 String website, String accountSite, String tickerSymbol, String type,
                                 String ownership, String industry, String employees, String annualRevenue,
                                 String sicCode, String billingStreet, String billingCity, String billingState,
                                 String billingZip, String billingCountry, String shippingStreet,
                                 String shippingCity, String shippingState, String shippingZip, String shippingCountry,
                                 String customerPriority, String sla, String slaSerialNumber, String numberOfLocations,
                                 String upsellOpportunity, String description) {
        log.info("Creating account: '{}'", accountName);
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

    @Step("Creating account: '{account.accountName}'")
    public void createNewAccount(Account account) {
        log.info("Creating account: '{}'", account);
        new PickList(driver, "Rating").select(account.getRating());
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Number").write(account.getAccountNumber());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Account Site").write(account.getAccountSite());
        new Input(driver, "Ticker Symbol").write(account.getTickerSymbol());
        new PickList(driver, "Type").select(account.getType());
        new PickList(driver, "Ownership").select(account.getOwnership());
        new PickList(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "SIC Code").write(account.getSicCode());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new PickList(driver, "Customer Priority").select(account.getCustomerPriority());
        new PickList(driver, "SLA").select(account.getSla());
        new Input(driver, "SLA Serial Number").write(account.getSlaSerialNumber());
        new Input(driver, "Number of Locations").write(account.getNumberOfLocations());
        new PickList(driver, "Upsell Opportunity").select(account.getUpsellOpportunity());
        new TextArea(driver, "Description").write(account.getDescription());
        driver.findElement(ACCOUNT_SAVE_BUTTON).click();
    }
}
