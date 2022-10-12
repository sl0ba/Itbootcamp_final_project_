package FinalProject.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminCitiesTest extends BaseTest {

    @Test
    public void VisitsTheAdminCitiesPageAndListCities() {
        homePage.goToLoginPage();
        loginPage.login();
        adminCitesPage.getAdminButton().click();
        adminCitesPage.getCitiesButton().click();

        String expectedResult = "https://vue-demo.daniel-avellaneda.com/admin/cities";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);

        Assert.assertTrue(adminCitesPage.getLogoutButton().isDisplayed());

        adminCitesPage.getLogoutButton().click();
    }

    @Test
    public void createNewCity() {
        homePage.goToLoginPage();
        loginPage.login();
        adminCitesPage.getAdminButton().click();
        adminCitesPage.getCitiesButton().click();
        adminCitesPage.createNewCity();

        String expectedResult = ("Saved successfully");
        String actualResult = adminCitesPage.getMessageSaved().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        adminCitesPage.getLogoutButton().click();
    }

    @Test(dependsOnMethods = {"createNewCity"})
    public void editCity() {
        homePage.goToLoginPage();
        loginPage.login();
        adminCitesPage.getAdminButton().click();
        adminCitesPage.getCitiesButton().click();
        adminCitesPage.editCity();

        String expectedResult = ("Saved successfully");
        String actualResult = adminCitesPage.getMessageSaved().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        adminCitesPage.getLogoutButton().click();

    }

    @Test(dependsOnMethods = {"createNewCity","editCity"})
    public void searchCity() {
        homePage.goToLoginPage();
        loginPage.login();
        adminCitesPage.getAdminButton().click();
        adminCitesPage.getCitiesButton().click();
        adminCitesPage.searchCity();

        String expectedResult = (adminCitesPage.getEditCity());
        String actualResult = adminCitesPage.getCityName().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        adminCitesPage.getLogoutButton().click();
    }

    @Test(dependsOnMethods = {"createNewCity", "editCity", "searchCity"})
    public void deleteCity() {
        homePage.goToLoginPage();
        loginPage.login();
        adminCitesPage.getAdminButton().click();
        adminCitesPage.getCitiesButton().click();
        adminCitesPage.searchCity();

        String expectedResultCityName = (adminCitesPage.getEditCity());
        String actualResultCityName = adminCitesPage.getCityName().getText();
        Assert.assertTrue(actualResultCityName.contains(expectedResultCityName));

        adminCitesPage.deleteCity();
        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[3]/div/div/div/div"));
        String expectedResultMessageDeleted = ("Deleted successfully");
        String actualResultMessageDeleted = adminCitesPage.getMessageDeleted().getText();
        Assert.assertTrue(actualResultMessageDeleted.contains(expectedResultMessageDeleted));

        adminCitesPage.getLogoutButton().click();
    }
}
