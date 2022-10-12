package FinalProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocalePage extends HomePage {


    private By languageButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button");

    private By esLanguageButton = By.id("list-item-75");
    private By enLanguageButton = By.id("list-item-73");
    private By frLanguageButton = By.id("list-item-77");

    private By header = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/h1");

    public LocalePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

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

    public WebElement getHeader() {
        return getDriver().findElement(header);
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
