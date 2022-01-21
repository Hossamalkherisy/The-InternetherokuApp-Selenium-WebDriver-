package Frame;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorpage=homepage.clickWYSIWYGpage();
        editorpage.clearTextArea();
        String text1="Hello ";
        String text2="World";
        editorpage.setTextArea(text1);
        editorpage.decreaseIndention();
        editorpage.setTextArea(text2);
       // Assert.assertEquals(editorpage.getTextFromEditor(),text1+text2,"Text From Editor Incorrect");


    }
}
