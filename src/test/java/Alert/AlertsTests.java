package Alert;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertpage=homepage.clickJavaScriptAlerts();
        alertpage.TriggerAlert();
        alertpage.alert_clickToAccpet();
        Assert.assertEquals(alertpage.getResult(),"You successfully clicked an alert","this incorrect result alert");

    }
    @Test
    public void testGetTextFromAlert(){
        var alertpage=homepage.clickJavaScriptAlerts();
        alertpage.TriggerConfirm();
        String Text_inAlert =alertpage.alert_getText();
        alertpage.alert_clickToDismiss();
        Assert.assertEquals(Text_inAlert,"I am a JS Confirm","alert Text is incorrect");
        Assert.assertEquals(alertpage.getResult(),"You clicked: Cancel","this incorrect result alert");

    }
    @Test
    public void testSetInputeInAlert(){
        var alertpage=homepage.clickJavaScriptAlerts();
        alertpage.TriggerPrompt();
        String text="TAU rocks";
        alertpage.akert_setInpute(text);
        alertpage.alert_clickToAccpet();
        Assert.assertEquals(alertpage.getResult(),"You entered: "+text,"Resulte Text not correct");
    }
}
