package FinalProject.Tests;

import FinalProject.Pages.HomePage;
import FinalProject.Pages.LoginPage;
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

    @BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srado\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver, driverWait);
        loginPage = new LoginPage(driver,driverWait);
    }

    @BeforeMethod
    public void basePage() {
        driver.get("https://vue-demo.daniel-avellaneda.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
    @AfterClass
    public void affterclass() {driver.quit();}


}
