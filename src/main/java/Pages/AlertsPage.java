package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By Result=By.id("result");
    private By triggerAlertBtn= By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By triggerConfirmationBtn= By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By triggerpromptionBtn= By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void TriggerAlert(){
        driver.findElement(triggerAlertBtn).click();
    }
    public void TriggerConfirm(){
        driver.findElement(triggerConfirmationBtn).click();
    }
    public void TriggerPrompt(){
        driver.findElement(triggerpromptionBtn).click();
    }
    public void alert_clickToAccpet(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText () {
        return driver.switchTo().alert().getText();
    }
    public void akert_setInpute(String InputText){
        driver.switchTo().alert().sendKeys(InputText);
    }
    public  String getResult(){
        return driver.findElement(Result).getText();
    }


}
