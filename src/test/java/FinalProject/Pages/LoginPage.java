package FinalProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends HomePage{
    private By emailField = By.id("email");
    private  By passwordField = By.id("password");
    private  By loginButton = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div/div[3]/span/form/div/div[3]/button/span");

    public LoginPage (WebDriver driver, WebDriverWait driverWait) {super(driver,driverWait);}

    public WebElement getEmailField() {return getDriver().findElement(emailField);}
    public WebElement getPasswordField() {return getDriver().findElement(passwordField);}
    public WebElement getLoginButton() {return getDriver().findElement(loginButton);}

    public void login(String email, String password) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }
}
