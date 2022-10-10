package FinalProject.Tests;

import FinalProject.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected HomePage homePage;
    protected LoginPage loginPage;

    protected SignupPage signupPage;

    protected AdminCitiesPage adminCitePage;
    protected AuthRoutePage authRoutePage;
    protected LocalePage localePage;
    protected ProfilePage profilePage;

    @BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srado\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver, driverWait);
        loginPage = new LoginPage(driver, driverWait);
        signupPage = new SignupPage(driver, driverWait);
        adminCitePage = new AdminCitiesPage(driver, driverWait);
        authRoutePage = new AuthRoutePage(driver, driverWait);
        localePage = new LocalePage(driver, driverWait);
        profilePage = new ProfilePage(driver, driverWait);

    }

    @BeforeMethod
    public void basePage() {
        driver.get("https://vue-demo.daniel-avellaneda.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @AfterClass
    public void affterclass() {
        driver.quit();
    }


}
