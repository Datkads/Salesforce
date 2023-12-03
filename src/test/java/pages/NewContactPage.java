package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

public class NewContactPage extends BasePage {

    private final By CONTACT_SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");

    public NewContactPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Contact/new");
    }

    public void createNewContact(String Phone, String HomePhone, String Salutation, String FirstName, String LastName,
                                 String Mobile, String Title, String OtherPhone, String Department, String Fax,
                                 String Email, String Assistant, String LeadSource, String AsstPhone,
                                 String MailingStreet, String MailingCity, String MailingState, String MailingZip,
                                 String MailingCountry, String OtherStreet, String OtherCity, String OtherState,
                                 String OtherZip, String OtherCountry, String Languages, String Level,
                                 String Description) {
        new Input(driver, "Phone").write(Phone);
        new Input(driver, "Home Phone").write(HomePhone);
        new PickList(driver, "Salutation").select(Salutation);
        new Input(driver, "First Name").write(FirstName);
        new Input(driver, "Last Name").write(LastName);
        new Input(driver, "Mobile").write(Mobile);
        new Input(driver, "Title").write(Title);
        new Input(driver, "Other Phone").write(OtherPhone);
        new Input(driver, "Department").write(Department);
        new Input(driver, "Fax").write(Fax);
        new Input(driver, "Email").write(Email);
        new Input(driver, "Assistant").write(Assistant);
        new PickList(driver, "Lead Source").select(LeadSource);
        new Input(driver, "Asst. Phone").write(AsstPhone);
        new TextArea(driver, "Mailing Street").write(MailingStreet);
        new Input(driver, "Mailing City").write(MailingCity);
        new Input(driver, "Mailing State/Province").write(MailingState);
        new Input(driver, "Mailing Zip/Postal Code").write(MailingZip);
        new Input(driver, "Mailing Country").write(MailingCountry);
        new TextArea(driver, "Other Street").write(OtherStreet);
        new Input(driver, "Other City").write(OtherCity);
        new Input(driver, "Other State/Province").write(OtherState);
        new Input(driver, "Other Zip/Postal Code").write(OtherZip);
        new Input(driver, "Other Country").write(OtherCountry);
        new Input(driver, "Languages").write(Languages);
        new PickList(driver, "Level").select(Level);
        new TextArea(driver, "Description").write(Description);
        driver.findElement(CONTACT_SAVE_BUTTON).click();
    }
}
