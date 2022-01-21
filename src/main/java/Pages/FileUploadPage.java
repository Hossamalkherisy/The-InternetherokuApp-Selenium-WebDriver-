package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By uploadBtn=By.id("file-submit");
    private By inputeBtn=By.id("file-upload");
    private By uploadedfile=By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver=driver;
    }
    public void ClickUploadButton(){

    }

    /**
     *
     * @param absolutePathFile
     */
    public void uploadfile(String absolutePathFile){
       driver.findElement(inputeBtn).sendKeys(absolutePathFile);
        driver.findElement(uploadBtn).click();
        //ClickUploadButton();
    }
    public  String getuploadeFile(){

        return driver.findElement(uploadedfile).getText();
    }
}
