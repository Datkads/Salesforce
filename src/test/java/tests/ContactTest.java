package tests;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test(description = "Contact creation test.")
    public void createContact() {
        loginPage.open();
        loginPage.login("drak@tms.sandbox", "Password01!!");
        homePage.isOpened();
        newContactPage.open();
        newContactPage.createNewContact("7-977-970-41-78",
                "7-977-970-41-78",
                "Mr.",
                "David",
                "Gelenidze",
                "7-977-970-41-78",
                "Sir",
                "123123",
                "FBI",
                "123123",
                "06/06/2000",
                "blabla@gmail.com",
                "Mrs. Ktoto",
                "Web",
                "123123",
                "mom@gmail.com",
                "Some Street 123",
                "City",
                "State",
                "123123",
                "Country",
                "Street 123",
                "City",
                "State",
                "123123",
                "Country",
                "Chinese",
                "Primary",
                "Delovoy chelovek");
    }

    @Test(description = "Contact creation test with @Builder.")
    public void createContactUsingBuilder() {
        loginPage.open();
        loginPage.isOpened();
        loginPage.login("drak@tms.sandbox", "Password01!!");
        homePage.isOpened();
        newContactPage.open();
        newContactPage.isOpened();
        newContactPage.createNewContact(contactBuilder);
    }
}
