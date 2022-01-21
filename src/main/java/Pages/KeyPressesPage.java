package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By Inputtext= By.id("target");
    private By ResultText=By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }
    public void EnterText(String Text){
        driver.findElement(Inputtext).sendKeys(Text);
    }
    public void Enterpi(){
        EnterText(Keys.chord(Keys.ALT,"227")+"3.14");
    }
    public String Getresult(){
        String Result =driver.findElement(ResultText).getText();
        return Result;
    }
}
