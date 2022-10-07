package FinalProject.Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminCitiesPage extends HomePage{

    public By adminButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[1]");

    public By citiesButton = By.id("list-item-117");

    public By logoutButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[2]");

    public By newItemButton = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/div[3]/form/div[1]/button");

    private By nameField = By.id("name");

    private By citySaveButton = By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[3]/button[2]");
    private By editSsaveButton = By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[3]/button[2]");


    private By searchField = By.id("search");


    private By editButton = By.id("edit");

    private By editCityField = By.id("name");

    private By deleteCityButton = By.id("delete");
    private By deleteCityButton2 = By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[2]/button[2]");

    private Faker faker = new Faker();
    private String city = faker.address().city();
    private final String editCity = city + " -edited";
    public AdminCitiesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getAdminButton() {return getDriver().findElement(adminButton);}
    public WebElement getCitiesButton() {return getDriver().findElement(citiesButton);}

    public WebElement getLogoutButton() {return getDriver().findElement(logoutButton);}
    public WebElement getNewItemtButton() {return getDriver().findElement(newItemButton);}
    public WebElement getNameField() {return getDriver().findElement(nameField);}
    public WebElement getCitySaveButton() {return getDriver().findElement(citySaveButton);}
    public WebElement getEditSaveButton() {return getDriver().findElement(editSsaveButton);}

    public WebElement getSearcField() {return getDriver().findElement(searchField);}
    public WebElement getEditButton() {return getDriver().findElement(editButton);}
    public WebElement getEditCityField() {return getDriver().findElement(editCityField);}
    public WebElement getDeleteCityButton() {return getDriver().findElement(deleteCityButton);}
    public WebElement getDeleteCityButton2() {return getDriver().findElement(deleteCityButton2);}

    public String getEditCity() {return editCity;}

    public void createNewCity () {
        getNewItemtButton().click();
        getNameField().sendKeys(city);
        getCitySaveButton().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public void editCity () {
        getSearcField().sendKeys(city);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        getEditButton().click();
        getEditCityField().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        getEditCityField().sendKeys(editCity);
        getEditSaveButton().click();
    }

    public void searchCity () {
        getSearcField().sendKeys(editCity);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCity () {
        getDeleteCityButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        getDeleteCityButton2().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }






}
