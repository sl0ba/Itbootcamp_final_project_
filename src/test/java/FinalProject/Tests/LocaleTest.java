package FinalProject.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTest extends BaseTest {

    @Test
    public void LocaleTest1() {
        localePage.esLaguage();
        String expectedResult = "Página de aterrizaje";
        String actualResult = localePage.getHeader().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void LocaleTest2() {
        localePage.enLaguage();
        String expectedResult = "Landing";
        String actualResult = localePage.getHeader().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void LocaleTest3() {
        localePage.frLaguage();
        String expectedResult = "Page d'atterrissage";
        String actualResult = localePage.getHeader().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
