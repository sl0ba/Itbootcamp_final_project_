package FinalProject.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminCitiesTest extends BaseTest {

    //getCityName().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
   /*
   Succes /delete message
   wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]"),
            "Saved successfully\nCLOSE"));
    WebElement messageBox = driver.findElement (By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]"));

    */

    @Test(priority = 1)
    public void adminCitiesTest1() {
        homePage.goToLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.login();
        adminCitePage.getAdminButton().click();
        adminCitePage.getCitiesButton().click();

        String expectedResult = "https://vue-demo.daniel-avellaneda.com/admin/cities";
        String url = driver.getCurrentUrl();
        String actualResult = url;
        Assert.assertEquals(actualResult, expectedResult);


        Assert.assertTrue(adminCitePage.getLogoutButton().isDisplayed());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        adminCitePage.getLogoutButton().click();

    }

    @Test(priority = 2)
    public void adminCitiesTest2() {
        homePage.goToLoginPage();
        loginPage.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        adminCitePage.getAdminButton().click();
        adminCitePage.getCitiesButton().click();
        adminCitePage.createNewCity();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]"));
        String expectedResult = ("Saved successfully");
        String actualResult = message.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        adminCitePage.getLogoutButton().click();
    }

    @Test(priority = 3)
    public void adminCitiesTest3() {
        //*[@id="app"]/div[1]/main/div/div[2]/div/div[3]/div/div/div/div
        homePage.goToLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        adminCitePage.getAdminButton().click();
        adminCitePage.getCitiesButton().click();
        adminCitePage.editCity();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[3]/div/div/div/div"));
        String expectedResult = ("Saved successfully");
        String actualResult = message.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        adminCitePage.getLogoutButton().click();

    }

    @Test (priority = 4)
    public void adminCitiesTest4() {
        homePage.goToLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        adminCitePage.getAdminButton().click();
        adminCitePage.getCitiesButton().click();
        adminCitePage.searchCity();

        WebElement cityName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[2]"));
        String expectedResult = (adminCitePage.getEditCity());
        String actualResult = cityName.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        adminCitePage.getLogoutButton().click();
    }

    @Test (priority = 5)
    public void adminCitiesTest5() {
        homePage.goToLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        adminCitePage.getAdminButton().click();
        adminCitePage.getCitiesButton().click();
        adminCitePage.searchCity();

        WebElement cityName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[2]"));
        String expectedResult = (adminCitePage.getEditCity());
        String actualResult = cityName.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        adminCitePage.deleteCity();
        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[3]/div/div/div/div"));
        String expectedResult2 = ("Deleted successfully");
        String actualResult2 = message.getText();
        Assert.assertTrue(actualResult2.contains(expectedResult2));

    }
}
