package FinalProject.Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends HomePage{
    private By emailField = By.id("email");
    private  By passwordField = By.id("password");
    private  By loginButton = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div/div[3]/span/form/div/div[3]/button/span");

    private Faker faker = new Faker();
    public LoginPage (WebDriver driver, WebDriverWait driverWait) {super(driver,driverWait);}

    public WebElement getEmailField() {return getDriver().findElement(emailField);}
    public WebElement getPasswordField() {return getDriver().findElement(passwordField);}
    public WebElement getLoginButton() {return getDriver().findElement(loginButton);}

    public void login() {
        getEmailField().clear();
        getEmailField().sendKeys("admin@admin.com");
        getPasswordField().clear();
        getPasswordField().sendKeys("12345");
        getLoginButton().click();
    }

    public void fakeLogin() {
        getEmailField().clear();
        getEmailField().sendKeys(faker.internet().emailAddress());
        getPasswordField().clear();
        getPasswordField().sendKeys(faker.internet().password());
        getLoginButton().click();
    }
    public void fakeLogin2(String email) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
        getPasswordField().clear();
        getPasswordField().sendKeys(faker.internet().password());
        getLoginButton().click();
    }
}
