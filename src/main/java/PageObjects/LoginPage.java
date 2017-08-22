package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Tatiana_Petukhova on 8/22/2017.
 */
public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    By usernameInput = By.xpath("//*[contains(@class,'login-input')]//input[@name='username']");

    By passInput = By.xpath("//*[contains(@class,'login-input')]//input[@name='password']");

    By loginButton = By.xpath("//*[contains(@class, 'login-submit-form')]//input[@type='submit']");

   // By openLoginMenu = By.xpath("");

    public LoginPage enterCredentialsAndLogin() {

        driver.findElement(usernameInput).sendKeys("kotench@gmail.com");
        driver.findElement(passInput).sendKeys("gagarrrr17");
        driver.findElement(loginButton).click();

        return this;
    }

}
