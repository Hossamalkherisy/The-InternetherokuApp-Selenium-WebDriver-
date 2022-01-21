package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class LoginPage {

    private WebDriver driver;
    private By username=By.id("username");
    private By password=By.id("password");
    private By loginBtn=By.xpath("//*[@id=\"login\"]/button/i");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public LoginToSecureAreapage ClickLogin() {
        driver.findElement(loginBtn).click();
        return new LoginToSecureAreapage(driver);
    }
    public void setUsername(String Username){
        driver.findElement(username).sendKeys(Username);
    }
    public void setPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }
}
