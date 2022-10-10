package FinalProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthRoutePage extends HomePage {


    public AuthRoutePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void openHomePage() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/home");
    }

    public void openProfilePage() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/profile");
    }

    public void openAdminCitiesPage() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/admin/cities");
    }

    public void openAdminUsersPage() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/admin/users");
    }
}
