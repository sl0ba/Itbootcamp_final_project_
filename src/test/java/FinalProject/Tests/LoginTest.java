package FinalProject.Tests;

import FinalProject.Pages.BasePage;
import FinalProject.Pages.HomePage;
import FinalProject.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {




 /*   @Test
    public void loginTest1() {

    }
*/
    @Test
    public void loginTest5() {
        //driver.manage().deleteAllCookies();
        homePage.goToLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.login("admin@admin.com", "12345");
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/home";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String url = driver.getCurrentUrl();
        String actualResult = url;
        Assert.assertEquals(actualResult,expectedResult);
    }





}
