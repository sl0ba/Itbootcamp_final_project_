package FinalProject.Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    private By login = By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[3]");
    private By signup = By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[4]");

    private String homePage = "https://vue-demo.daniel-avellaneda.com/home";

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    private Faker faker = new Faker();


    private WebElement getLoginButton() {
        return getDriver().findElement(login);
    }

    private WebElement getSignupButton() {
        return getDriver().findElement(signup);
    }

    public String getHomePage() {
        return homePage;
    }

    public Faker getFaker() {
        return faker;
    }


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
