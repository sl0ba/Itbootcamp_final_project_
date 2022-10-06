package FinalProject.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignupTest extends BaseTest{

    @Test
    public void signupTest1 () {
        homePage.goTosignupPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/signup";
        String url = driver.getCurrentUrl();
        String actualResult = url;
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void signupTest2 () {
        homePage.goTosignupPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String expectedResult = "email";
        String actualResult = signupPage.getEmailField().getAttribute("type");
        Assert.assertEquals(actualResult,expectedResult);


        String expectedResult2 = "password";
        String actualResult2 = signupPage.getPasswordField().getAttribute("type");
        Assert.assertEquals(actualResult2,expectedResult2);

        String expectedResult3 = "password";
        String actualResult3 = signupPage.getConfirmPasswordField().getAttribute("type");
        Assert.assertEquals(actualResult3,expectedResult3);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void signupTest3 () {
        homePage.goTosignupPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        signupPage.signup();
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[3]/div/div/div/div/div[1]"));
        String expectedResult = ("E-mail already exists");
        String actualResult = errorMessage.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        String expectedResult2 = ("https://vue-demo.daniel-avellaneda.com/signup");
        String url = driver.getCurrentUrl();
        String actualResult2 = url;
        Assert.assertEquals(actualResult2, expectedResult2);
    }

    @Test
    public void signupTest4 () {
        homePage.goTosignupPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        signupPage.signupStudent();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div"));
        String expectedResult = ("IMPORTANT: Verify your account");
        String actualResult = errorMessage.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
