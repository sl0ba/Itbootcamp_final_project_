package FinalProject.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AuthRoutesTest extends BaseTest {

    @Test
    public void forbidsVisitsToHomeUrlIfNotAuthenticated() {
        authRoutePage.openHomePage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void forbidsVisitsToProfileUrlIfNotAuthenticated() {
        authRoutePage.openProfilePage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void forbidsVisitsToAdminCitiesUrlIfNotAuthenticated() {
        authRoutePage.openAdminCitiesPage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void forbidsVisitsToAdminUsersUrlIfNotAuthenticated() {
        authRoutePage.openAdminUsersPage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
