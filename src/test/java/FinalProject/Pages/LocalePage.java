package FinalProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocalePage extends HomePage {

    public LocalePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    private By languageButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button");

    private By esLanguageButton = By.id("list-item-75");
    private By enLanguageButton = By.id("list-item-73");
    private By frLanguageButton = By.id("list-item-77");

    public WebElement getLanguageButton() {
        return getDriver().findElement(languageButton);
    }

    public WebElement getEsLanguageButton() {
        return getDriver().findElement(esLanguageButton);
    }

    public WebElement getEnLanguageButton() {
        return getDriver().findElement(enLanguageButton);
    }

    public WebElement getFrLanguageButton() {
        return getDriver().findElement(frLanguageButton);
    }

    public void esLaguage() {
        getLanguageButton().click();
        getEsLanguageButton().click();
    }

    public void enLaguage() {
        getLanguageButton().click();
        getEnLanguageButton().click();
    }

    public void frLaguage() {
        getLanguageButton().click();
        getFrLanguageButton().click();
    }
}
