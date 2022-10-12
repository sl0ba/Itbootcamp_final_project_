package FinalProject.Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends HomePage {

    private By myProfileButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/a[3]");
    private By nameField = By.id("name");
    private By phoneField = By.id("phone");
    private By cityField = By.id("city");
    private By countryField = By.id("country");
    private By twitterField = By.id("urlTwitter");
    private By gitHubField = By.id("urlGitHub");

    private By saveButton = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[2]/span/form/div/div/div[8]/button");



    private String name = getFaker().name().fullName();
    private String phoneNumber = getFaker().phoneNumber().phoneNumber();
    private String city = getFaker().address().city();
    private String country = getFaker().address().country();

    private String twitter = "https://twitter.com" + getFaker().name().firstName().toLowerCase();
    private String gitHub = "https://github.com" + getFaker().name().firstName().toLowerCase();

    private By messageSaved = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div/div[1]");


    public ProfilePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getMyProfileButton() {
        return getDriver().findElement(myProfileButton);
    }

    public WebElement getNameField() {
        return getDriver().findElement(nameField);
    }

    public WebElement getPhoneField() {
        return getDriver().findElement(phoneField);
    }

    public WebElement getCityField() {
        return getDriver().findElement(cityField);
    }

    public WebElement getCountryField() {
        return getDriver().findElement(countryField);
    }

    public WebElement getTwitterField() {
        return getDriver().findElement(twitterField);
    }

    public WebElement getGitHubField() {
        return getDriver().findElement(gitHubField);
    }

    public WebElement getSaveButton() {
        return getDriver().findElement(saveButton);
    }
    public WebElement getMessageSaved () {return getDriver().findElement(messageSaved);}


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void editProfile() {
        getMyProfileButton().click();
        getNameField().click();
        getNameField().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        getNameField().sendKeys(name);

        getPhoneField().click();
        getPhoneField().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        getPhoneField().sendKeys(phoneNumber);

        getCityField().click();
        getCityField().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        getCityField().sendKeys(city);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        getCountryField().click();
        getCountryField().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        getCountryField().sendKeys(country);

        getTwitterField().click();
        getTwitterField().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        getTwitterField().sendKeys(twitter);

        getGitHubField().click();
        getGitHubField().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        getGitHubField().sendKeys(gitHub);

        getSaveButton().click();

    }
}
