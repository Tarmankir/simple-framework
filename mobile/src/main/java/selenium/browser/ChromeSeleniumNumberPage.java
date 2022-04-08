package selenium.browser;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.DataConverter.separateNumberInString;
import static org.testng.Assert.assertEquals;

public class ChromeSeleniumNumberPage {

    @FindBy(xpath = "//*[@class='tm-pagination__page tm-pagination__page_current']")
    private MobileElement numberPage;

    private AppiumDriver<MobileElement> driver;

    public ChromeSeleniumNumberPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(numberPage));
    }

    @Step("Get URL in string")
    public String getUrlInString() {
        return driver.getCurrentUrl();
    }

    @Step("Page number comparison")
    public void pageNumberComparison() {
        assertEquals(separateNumberInString(getUrlInString()), numberPage.getText());
    }
}