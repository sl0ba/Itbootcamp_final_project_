package FinalProject.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {


    @Test
    public void visitTheLoginPage() {
        homePage.goToLoginPage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checksInputTypes() {
        homePage.goToLoginPage();

        String expectedResultEmail = "email";
        String actualResultEmail = loginPage.getEmailField().getAttribute("type");
        Assert.assertEquals(actualResultEmail, expectedResultEmail);

        String expectedResultPassword = "password";
        String actualResultPassword = loginPage.getPasswordField().getAttribute("type");
        Assert.assertEquals(actualResultPassword, expectedResultPassword);
    }


    @Test
    public void displaysErrorsWhenUserDoesNotExist() {
        homePage.goToLoginPage();

        loginPage.fakeLogin();
        String expectedResultErrorMessage = ("User does not exists");
        String actualResultErrorMessage = loginPage.getErrorMessageUser().getText();
        Assert.assertTrue(actualResultErrorMessage.contains(expectedResultErrorMessage));

        String expectedResultUrl = ("https://vue-demo.daniel-avellaneda.com/login");
        String actualResultUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualResultUrl, expectedResultUrl);

    }

    @Test
    public void displaysErrorsWhenPasswordIsWrong() {
        homePage.goToLoginPage();

        loginPage.fakeLogin2();
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div/div[1]/ul/li"));
        String expectedResultErrorMessage = ("Wrong password");
        String actualResultErrorMesaage = loginPage.getErrorMessagePassword().getText();
        Assert.assertEquals(actualResultErrorMesaage, expectedResultErrorMessage);

        String expectedResultUrl = ("https://vue-demo.daniel-avellaneda.com/login");
        String actualResultUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualResultUrl, expectedResultUrl);
    }

    @Test
    public void login() {
        homePage.goToLoginPage();

        loginPage.login();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Thread sleep is necessary to wait for page redirection.
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/home";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);

        loginPage.getLogoutButton().click();
    }

    @Test
    public void logout() {
        homePage.goToLoginPage();

        loginPage.login();
        Assert.assertEquals(true, loginPage.getLogoutButton().isDisplayed());

        loginPage.getLogoutButton().click();
        String expectedResultUrl1 = ("https://vue-demo.daniel-avellaneda.com/login");
        String actualResultUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(actualResultUrl1, expectedResultUrl1);

        homePage.getHomePage();
        String expectedResultUrl2 = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResultUrl2 = driver.getCurrentUrl();
        Assert.assertEquals(actualResultUrl2, expectedResultUrl2);
    }
}
