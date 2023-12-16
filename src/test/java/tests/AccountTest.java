package tests;

import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test(description = "Account creation test.")
    public void createAccount() {
        //https://tms41-dev-ed.my.salesforce.com/
        //drak@tms.sandbox
        //Password01!!

        loginPage.open();
        loginPage.login("drak@tms.sandbox", "Password01!!");
        homePage.isOpened();
        newAccountPage.open();
        newAccountPage.createNewAccount("Warm",
                "TMS Rak Dmitry",
                "7-977-970-41-78",
                "7-977-970-41-78",
                "123",
                "teachmeskills.by",
                "teachmeskills.by",
                "123",
                "Prospect",
                "Public",
                "Banking",
                "1",
                "1",
                "123",
                "Blabla Street 123",
                "Blabla City",
                "Blabla State",
                "123",
                "Blabla",
                "OchenMnogoTeksta",
                "EasterEgg",
                "blabla",
                "123",
                "Blabla",
                "High",
                "Gold",
                "123",
                "1",
                "Yes",
                "Mda");

    }

    @Test(description = "Account creation test with @Builder")
    public void createAccountUsingBuilder() {
        loginPage.open();
        loginPage.isOpened();
        loginPage.login("drak@tms.sandbox", "Password01!!");
        homePage.isOpened();
        newAccountPage.open();
        newAccountPage.isOpened();
        newAccountPage.createNewAccount(accountBuilder);
    }
}
