package FinalProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;

    public BasePage() {
    }

    public BasePage(WebDriver driver, WebDriverWait driverWait) {

        this.driver = driver;
        this.driverWait=driverWait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getDriverWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
