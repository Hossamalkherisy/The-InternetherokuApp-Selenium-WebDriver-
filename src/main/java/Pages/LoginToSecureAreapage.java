package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginToSecureAreapage {
    private WebDriver driver;
    private By StatusAlert=By.id("flash");

    public LoginToSecureAreapage(WebDriver driver){
        this.driver=driver;
    }
    public String getAlertTest(){

        String STATUS=driver.findElement(StatusAlert).getText();
        return STATUS;
    }
}
