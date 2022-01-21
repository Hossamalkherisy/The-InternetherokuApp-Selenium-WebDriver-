package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomePage {
    private WebDriver driver;
    private By table= By.id("large-table");

    public LargeAndDeepDomePage(WebDriver driver){
        this.driver=driver;

    }
    public void scrollToTable(){
        WebElement TableElement =driver.findElement(table);
        String script="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,TableElement);
    }


}
