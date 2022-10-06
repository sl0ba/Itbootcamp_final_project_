package FinalProject.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {




     @Test
    public void loginTest1() {
         homePage.goToLoginPage();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
         String url = driver.getCurrentUrl();
         String actualResult = url;
         Assert.assertEquals(actualResult,expectedResult);
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }

     @Test
     public void loginTest2() {
         homePage.goToLoginPage();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         String expectedResult = "email";
         String actualResult = loginPage.getEmailField().getAttribute("type");
         Assert.assertEquals(actualResult,expectedResult);
         String expectedResult2 = "password";
         String actualResult2 = loginPage.getPasswordField().getAttribute("type");
         Assert.assertEquals(actualResult2,expectedResult2);
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

     }


     @Test
     public void loginTest3() {
         homePage.goToLoginPage();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         loginPage.fakeLogin();
         WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div/div[1]"));
         String expectedResult = ("User does not exists");
         String actualResult = errorMessage.getText();
         Assert.assertTrue(actualResult.contains(expectedResult));

         String expectedResult2 = ("https://vue-demo.daniel-avellaneda.com/login");
         String url = driver.getCurrentUrl();
         String actualResult2 = url;
         Assert.assertEquals(actualResult2, expectedResult2);

         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }

     @Test
     public void loginTest4() {
         homePage.goToLoginPage();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         loginPage.fakeLogin2("admin@admin.com");
         WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div/div[1]/ul/li"));
         String expectedResult = ("Wrong password");
         String actualResult = String.valueOf(errorMessage.getText());
         Assert.assertEquals(actualResult, expectedResult);

         String expectedResult2 = ("https://vue-demo.daniel-avellaneda.com/login");
         String url = driver.getCurrentUrl();
         String actualResult2 = url;
         Assert.assertEquals(actualResult2, expectedResult2);
     }

    @Test
    public void loginTest5() {
        homePage.goToLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.login();
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

    @Test
    public void loginTest6() {
        homePage.goToLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.login();
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[2]/span"));
        Assert.assertEquals(true, logoutButton.isDisplayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logoutButton.click();

        String expectedResult = ("https://vue-demo.daniel-avellaneda.com/login");
        String url = driver.getCurrentUrl();
        String actualResult = url;
        Assert.assertEquals(actualResult, expectedResult);

        driver.get("https://vue-demo.daniel-avellaneda.com/home");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String expectedResult2 = "https://vue-demo.daniel-avellaneda.com/login";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String url2 = driver.getCurrentUrl();
        String actualResult2 = url;
        Assert.assertEquals(actualResult2,expectedResult2);


    }

}
