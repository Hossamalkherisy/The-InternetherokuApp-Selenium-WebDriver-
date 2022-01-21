package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.ListResourceBundle;
import java.util.stream.Collectors;

public class DropdownPage{

    private WebDriver driver;
    public By dropdown=By.id("dropdown");

    public DropdownPage(WebDriver driver){

        this.driver=driver;
    }

    public void selectFromDropdown(String option){

        findDropElement().selectByVisibleText(option);
    }

    public List<String> getSelectOption(){
        List<WebElement>selectelment =findDropElement().getAllSelectedOptions();
        return  selectelment.stream().map(e ->e.getText()).collect(Collectors.toList());
    }
    private Select findDropElement(){

        return new  Select(driver.findElement(dropdown));

    }
}
