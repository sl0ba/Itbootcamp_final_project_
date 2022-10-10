package FinalProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);

    }

    private By login = By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[3]");
    private By signup = By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[4]");


    private WebElement getLoginButton() {
        return getDriver().findElement(login);
    }

    private WebElement getSignupButton() {
        return getDriver().findElement(signup);
    }

    ;


    public void goToLoginPage() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com");
        WebElement clickOnLogin = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[3]"));
        clickOnLogin.click();
    }

    public void goToSignupPage() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com");
        WebElement clickOnsignup = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[4]"));
        clickOnsignup.click();
    }


}
