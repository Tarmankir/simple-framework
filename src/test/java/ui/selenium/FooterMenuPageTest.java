package ui.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenium.pages.FooterMenuPage;
import ui.settings.DriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.Config.getSetting;

public class FooterMenuPageTest extends DriverSetup {

    private WebDriver driver;
    private FooterMenuPage footerMenuPage;
    @BeforeMethod
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        driver.get(getSetting("mainURL"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void footerMenuPageTest() {
        footerMenuPage.clickLinkContent();
        footerMenuPage.clickLinkContent2();
        footerMenuPage.switchWindowBack();
        footerMenuPage.checkButtonLogin("Войти");
    }
}