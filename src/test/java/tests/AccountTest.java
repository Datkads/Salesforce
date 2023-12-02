package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

import java.time.Duration;

public class AccountTest extends BaseTest {

    @Test
    public void createAccount() {
        //https://tms41-dev-ed.my.salesforce.com/
        //drak@tms.sandbox
        //Password01!!

        driver.get("https://tms41-dev-ed.my.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("drak@tms.sandbox");
        driver.findElement(By.id("password")).sendKeys("Password01!!");
        driver.findElement(By.id("Login")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title=User]")));
        //driver.get("https://tms41-dev-ed.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        //driver.findElement(By.cssSelector("[title=New]")).click();
        driver.get("https://tms41-dev-ed.lightning.force.com/lightning/o/Account/new");
        new Input(driver, "Account Name").write("TMS Dzmitry test");
        new Input(driver, "Account Number").write("281281");
        new TextArea(driver, "Billing Street").write("Baker street 4b");
        new PickList(driver, "Type").select("Prospect");
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
    }
}
