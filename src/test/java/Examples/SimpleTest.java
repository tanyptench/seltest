package Examples;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tatiana_Petukhova on 8/22/2017.
 */
public class SimpleTest {

    @Test
    public void login() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tatiana_Petukhova\\Documents\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://spb.hh.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        //loginPage
        loginPage.enterCredentialsAndLogin();
    }
}
