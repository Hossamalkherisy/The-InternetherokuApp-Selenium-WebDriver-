package JavaScript;

import Base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homepage.cliclLargeandDeepDom().scrollToTable();
    }
}
