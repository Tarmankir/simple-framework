package settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDriverSetup {

    private ChromeOptions options;

    public ChromeOptions getOptions() {
        options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("window-size=1280,768");
        WebDriverManager.chromedriver().setup();
        return options;
    }

    public URL getSelenoidUrl() throws MalformedURLException {
        URL SelenoidUrl = new URL("http://localhost:4444/wd/hub");
        return SelenoidUrl;
    }

    public DesiredCapabilities getSelenoidCapabilities(ChromeOptions options) {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability("enableVNC", true);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("61.0");
        return capabilities;
    }
}