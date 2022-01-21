package wait;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {

    @Test
    public void testwaitHidden(){
        var loadingpage=homepage.clickDynamicLoading().clickExample1();
        loadingpage.clickStart();
        Assert.assertEquals(loadingpage.getLoadedText(),"Hello World!","Text Loding is incorrrect");

    }
}
