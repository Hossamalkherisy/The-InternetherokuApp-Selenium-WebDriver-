package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

    private WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
    }

    private void ClickLink(String Linkttext){
        driver.findElement(By.linkText(Linkttext)).click();
    }

    public LargeAndDeepDomePage cliclLargeandDeepDom(){
        ClickLink("Large & Deep DOM");
        return new LargeAndDeepDomePage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        ClickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGpage(){
        ClickLink( "WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        ClickLink( "File Upload");
        return new FileUploadPage(driver);
    }
    public AlertsPage clickJavaScriptAlerts(){
        ClickLink( "JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public KeyPressesPage ClickKeyPresses(){
        ClickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HoversPage clickHovers(){
        ClickLink("Hovers");
        return new HoversPage(driver);
    }
    public LoginPage clickFormAuthenticon(){
        ClickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickdropdownpage(){
        ClickLink("Dropdown");
        return new DropdownPage(driver);
    }



}
