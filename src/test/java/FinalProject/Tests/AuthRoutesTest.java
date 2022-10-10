package FinalProject.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AuthRoutesTest extends BaseTest{

    @Test
    public void authRoutesTest1() {
        authRoutePage.openHomePage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void authRoutesTest2() {
        authRoutePage.openProfilePage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void authRoutesTest3() {
        authRoutePage.openAdminCitiesPage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void authRoutesTest4() {
        authRoutePage.openAdminUsersPage();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }
}
