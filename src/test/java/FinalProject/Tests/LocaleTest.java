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
        WebElement header = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/h1"));
        String actualResult = header.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void LocaleTest2() {
        localePage.enLaguage();
        String expectedResult = "Landing";
        WebElement header = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/h1"));
        String actualResult = header.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void LocaleTest3() {
        localePage.frLaguage();
        String expectedResult = "Page d'atterrissage";
        WebElement header = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/h1"));
        String actualResult = header.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
