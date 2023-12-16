package pages;

import dto.Contact;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

@Log4j2
public class NewContactPage extends BasePage {

    private final By CONTACT_SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");

    public NewContactPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Contact/new");
    }

    public void isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CONTACT_SAVE_BUTTON));
    }

    @Step("Creating contact: '{firstName}'")
    public void createNewContact(String phone, String homePhone, String salutation, String firstName, String lastName,
                                 String mobile, String title, String otherPhone, String department, String fax,
                                 String birthDate, String email, String assistant, String leadSource, String asstPhone,
                                 String momsEmail, String mailingStreet, String mailingCity, String mailingState,
                                 String mailingZip, String mailingCountry, String otherStreet, String otherCity,
                                 String otherState, String otherZip, String otherCountry, String languages,
                                 String level, String description) {
        log.info("Creating contact: '{}'", firstName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Home Phone").write(homePhone);
        new PickList(driver, "Salutation").select(salutation);
        new Input(driver, "First Name").write(firstName);
        new Input(driver, "Last Name").write(lastName);
        new Input(driver, "Mobile").write(mobile);
        new Input(driver, "Title").write(title);
        new Input(driver, "Other Phone").write(otherPhone);
        new Input(driver, "Department").write(department);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Birthdate").write(birthDate);
        new Input(driver, "Email").write(email);
        new Input(driver, "Assistant").write(assistant);
        new PickList(driver, "Lead Source").select(leadSource);
        new Input(driver, "Asst. Phone").write(asstPhone);
        new Input(driver, "mom's email").write(momsEmail);
        new TextArea(driver, "Mailing Street").write(mailingStreet);
        new Input(driver, "Mailing City").write(mailingCity);
        new Input(driver, "Mailing State/Province").write(mailingState);
        new Input(driver, "Mailing Zip/Postal Code").write(mailingZip);
        new Input(driver, "Mailing Country").write(mailingCountry);
        new TextArea(driver, "Other Street").write(otherStreet);
        new Input(driver, "Other City").write(otherCity);
        new Input(driver, "Other State/Province").write(otherState);
        new Input(driver, "Other Zip/Postal Code").write(otherZip);
        new Input(driver, "Other Country").write(otherCountry);
        new Input(driver, "Languages").write(languages);
        new PickList(driver, "Level").select(level);
        new TextArea(driver, "Description").write(description);
        driver.findElement(CONTACT_SAVE_BUTTON).click();
    }

    @Step("Creating contact: '{contact.firstName}'")
    public void createNewContact(Contact contact) {
        log.info("Creating contact: '{}'", contact);
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new PickList(driver, "Salutation").select(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Birthdate").write(contact.getBirthDate());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new PickList(driver, "Lead Source").select(contact.getLeadSource());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "mom's email").write(contact.getMomsEmail());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other State/Province").write(contact.getOtherState());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherZip());
        new Input(driver, "Other Country").write(contact.getOtherCountry());
        new Input(driver, "Languages").write(contact.getLanguages());
        new PickList(driver, "Level").select(contact.getLevel());
        new TextArea(driver, "Description").write(contact.getDescription());
        driver.findElement(CONTACT_SAVE_BUTTON).click();
    }
}
