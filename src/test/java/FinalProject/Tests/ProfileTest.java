package FinalProject.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTest extends BaseTest {


    @Test
    public void editProfileTest() {
        loginPage.goToLoginPage();
        loginPage.login();
        profilePage.editProfile();
        String expectedResult = "Profile saved successfuly";
        String actualResult = profilePage.getMessageSaved().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));


       String expectedResultName = profilePage.getName();
       String actualResultName = profilePage.getNameField().getAttribute("value");
       Assert.assertEquals(actualResultName,expectedResultName);

       String expectedResultPhoneNumber = profilePage.getPhoneNumber();
       String actualResultPhoneNumber = profilePage.getPhoneField().getAttribute("value");
       Assert.assertEquals(actualResultPhoneNumber,expectedResultPhoneNumber);

       /*
        String expectedResultCity = profilePage.getCity();
        String actualResultCity = profilePage.getCityField().getAttribute("value");
        Assert.assertEquals(actualResultCity,expectedResultCity);

        String expectedResultCountry = profilePage.getCountry();
        String actualResultCountry = profilePage.getCountryField().getAttribute("value");
        Assert.assertEquals(actualResultCountry,expectedResultCountry);

        It only functions with the real city and the real country. Here, we worked with the fake name of the city and
        fake name of the country.
        */

        String expectedResultTwitter = profilePage.getTwitter();
        String actualResultTwitter = profilePage.getTwitterField().getAttribute("value");
        Assert.assertEquals(actualResultTwitter,expectedResultTwitter);

        String expectedResultGitHub = profilePage.getGitHub();
        String actualResultGitHub = profilePage.getGitHubField().getAttribute("value");
        Assert.assertEquals(actualResultGitHub,expectedResultGitHub);


    }
}
