package FinalProject.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignupTest extends BaseTest {

    @Test
    public void visitSignUpPage() {
        homePage.goToSignupPage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/signup";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checksInputTypes() {
        homePage.goToSignupPage();

        String expectedResultEmail = "email";
        String actualResultEmail = signupPage.getEmailField().getAttribute("type");
        Assert.assertEquals(actualResultEmail, expectedResultEmail);


        String expectedResultPassword = "password";
        String actualResultPassword = signupPage.getPasswordField().getAttribute("type");
        Assert.assertEquals(actualResultPassword, expectedResultPassword);

        String expectedResultConfirmPassword = "password";
        String actualResultConfirmPassword = signupPage.getConfirmPasswordField().getAttribute("type");
        Assert.assertEquals(actualResultConfirmPassword, expectedResultConfirmPassword);
    }

    @Test
    public void displayErrorsWhenUserAlreadyExists() {
        homePage.goToSignupPage();
        signupPage.signup();

        String expectedResultErrorMessage = ("E-mail already exists");
        String actualResultErrorMessage = signupPage.getErrorMessage().getText();
        Assert.assertTrue(actualResultErrorMessage.contains(expectedResultErrorMessage));

        String expectedResultUrl = ("https://vue-demo.daniel-avellaneda.com/signup");
        String actualResultUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualResultUrl, expectedResultUrl);
    }

    @Test
    public void signup() {
        homePage.goToSignupPage();
        signupPage.signupStudent();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Thread sleep is necessary to wait for message being displayed
        String expectedResult = ("IMPORTANT: Verify your account");
        String actualResult = signupPage.getMessageVerifyAccount().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        signupPage.getCloseButton().click();
        signupPage.getLogoutButton().click();
    }

}
