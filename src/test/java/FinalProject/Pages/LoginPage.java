package FinalProject.Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends HomePage {
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div/div[3]/span/form/div/div[3]/button/span");

    private By errorMessageUser = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div/div[1]");

    private By errorMessagePassword = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div/div[1]/ul/li");

    private By logoutButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[2]/span");


    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getEmailField() {
        return getDriver().findElement(emailField);
    }

    public WebElement getPasswordField() {
        return getDriver().findElement(passwordField);
    }

    public WebElement getLoginButton() {
        return getDriver().findElement(loginButton);
    }

    public WebElement getErrorMessageUser() {
        return getDriver().findElement(errorMessageUser);
    }

    public WebElement getErrorMessagePassword() {
        return getDriver().findElement(errorMessagePassword);
    }

    public WebElement getLogoutButton() {
        return getDriver().findElement(logoutButton);
    }


    public void login() {
        getEmailField().clear();
        getEmailField().sendKeys("admin@admin.com");
        getPasswordField().clear();
        getPasswordField().sendKeys("12345");
        getLoginButton().click();
    }

    public void fakeLogin() {
        getEmailField().clear();
        getEmailField().sendKeys(getFaker().internet().emailAddress());
        getPasswordField().clear();
        getPasswordField().sendKeys(getFaker().internet().password());
        getLoginButton().click();
    }

    public void fakeLogin2() {
        getEmailField().clear();
        getEmailField().sendKeys("admin@admin.com");
        getPasswordField().clear();
        getPasswordField().sendKeys(getFaker().internet().password());
        getLoginButton().click();
    }
}
