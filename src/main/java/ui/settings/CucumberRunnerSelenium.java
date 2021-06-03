package ui.settings;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;

@CucumberOptions(features = "featureFiles", glue = "ui/cucumber/selenium")
public class CucumberRunnerSelenium extends AbstractTestNGCucumberTests {

    private FirefoxOptions options;
    private WebDriver driver;

    public FirefoxOptions getOptions() {
        options = new FirefoxOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");
        options.addArguments("window-size=1280x768");
        FirefoxDriverManager.firefoxdriver().setup();
        return options;
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }
}