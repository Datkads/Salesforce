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

    public void createNewContact(String phone, String homePhone, String salutation, String firstName, String lastName,
                                 String mobile, String title, String otherPhone, String department, String fax,
                                 String birthDate, String email, String assistant, String leadSource, String asstPhone,
                                 String momsEmail, String mailingStreet, String mailingCity, String mailingState,
                                 String mailingZip, String mailingCountry, String otherStreet, String otherCity,
                                 String otherState, String otherZip, String otherCountry, String languages,
                                 String level, String description) {
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
}
