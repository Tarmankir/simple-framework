package ui.loginPage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.pages.LoginPage;
import ui.settings.DriverSet;
import static ui.enums.Credentials.*;
import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.Config.getSetting;

public class LoginPageTest extends DriverSet {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void driverSet() {
        driver = new FirefoxDriver();
        driver.manage().window().setSize( new Dimension( 1280, 768 ) );
        loginPage = initElements(driver, LoginPage.class);
        driver.get(getSetting("baseUrl"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void loginPageTest() {
        loginPage.loginIn(TEST1);
        loginPage.clickLogin();
        loginPage.checkLogin("https://habr.com/ru/users/tarman332/");
    }
}