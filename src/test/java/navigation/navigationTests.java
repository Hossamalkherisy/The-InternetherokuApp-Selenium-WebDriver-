package navigation;

import Base.BaseTests;
import org.testng.annotations.Test;

public class navigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        homepage.clickDynamicLoading().clickExample1();
        getWindowManger().goBack();
        getWindowManger().goRefresh();
        getWindowManger().goForward();
        getWindowManger().goTo("https://www.google.com/");

    }
}
