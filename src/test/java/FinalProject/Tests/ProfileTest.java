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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        profilePage.editProfile();
        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div/div[1]"));
        String expectedResult = "Profile saved successfuly";
        String actualResult = message.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        /*
       String expectedResultName = profilePage.getName();
       String actualResultname = profilePage.getNameField().getAttribute("value");
       Assert.assertEquals(actualResultname,expectedResultName);

         */
    }
}
