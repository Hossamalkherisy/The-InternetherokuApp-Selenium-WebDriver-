package Hover;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class HoverTests extends BaseTests {


    @Test
    public void testHoverUser1(){
        var hoversPage = homepage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        /*System.out.println(caption.isCaptionDisplayed());
        System.out.println(caption.getTitle());
        System.out.println(caption.getLinkText());
        System.out.println(caption.getLinkText().endsWith("/users/1"));*/
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
       // assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
