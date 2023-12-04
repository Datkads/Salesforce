package tests;

import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void createAccount() {
        //https://tms41-dev-ed.my.salesforce.com/
        //drak@tms.sandbox
        //Password01!!

        loginPage.open();
        loginPage.login("drak@tms.sandbox", "Password01!!");
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title=User]")));
        //driver.get("https://tms41-dev-ed.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        //driver.findElement(By.cssSelector("[title=New]")).click();
        newAccountPage.open();
        newAccountPage.createNewAccount("Warm", "TMS Dmitry Rak", "7-977-970-41-78","7-977-970-41-78",
                "123", "teachmeskills.by", "teachmeskills.by", "123",
                "Prospect", "Public", "Banking", "1", "1", "123",
                "Blabla Street 123", "Blabla City", "Blabla State", "123",
                "Blabla", "OchenMnogoTeksta", "EasterEgg", "blabla",
                "123", "Blabla", "High", "Gold", "123",
                "1", "Yes", "Mda");
    }
}
