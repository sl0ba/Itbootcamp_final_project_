package FinalProject.Pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends HomePage {

    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private  By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");

    private Faker faker = new Faker();
    private  By signMeUpButton = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[2]/span/form/div/div[5]/button");

    public SignupPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public WebElement getNameField() {return getDriver().findElement(nameField);}
    public WebElement getEmailField() {return getDriver().findElement(emailField);}
    public WebElement getPasswordField() {return getDriver().findElement(passwordField);}
    public WebElement getConfirmPasswordField() {return getDriver().findElement(confirmPasswordField);}

    public WebElement getSignMeUpButton() {return getDriver().findElement(signMeUpButton);}

    public void signup() {
        getNameField().clear();
        getNameField().sendKeys("Test Test");
        getEmailField().clear();
        getEmailField().sendKeys("admin@admin.com");
        getPasswordField().clear();
        getPasswordField().sendKeys("123654");
        getConfirmPasswordField().clear();
        getConfirmPasswordField().sendKeys("123654");
        getSignMeUpButton().click();
    }
    public void signupStudent() {
        getNameField().clear();
        getNameField().sendKeys("Slobodan Radovic");
        getEmailField().clear();
        getEmailField().sendKeys(faker.internet().emailAddress());
        getPasswordField().clear();
        getPasswordField().sendKeys("123456");
        getConfirmPasswordField().clear();
        getConfirmPasswordField().sendKeys("123456");
        getSignMeUpButton().click();
    }


}
