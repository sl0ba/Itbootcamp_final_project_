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
    }
}
