package Keys;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyTests extends BaseTests {

    @Test
    public void testBackSpace(){
        var Keypage =homepage.ClickKeyPresses();
        Keypage.EnterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(Keypage.Getresult(),"You entered: BACK_SPACE","This Correct Result");

    }
    @Test
    public void testpi(){
        var keypage=homepage.ClickKeyPresses();
        keypage.Enterpi();
    }
}
