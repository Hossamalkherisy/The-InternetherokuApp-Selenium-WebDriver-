package Dropdown;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testselectoption(){

        var  dropDownpage=homepage.clickdropdownpage();
        String option="Option 2";
        dropDownpage.selectFromDropdown(option);
        var slectedOption=dropDownpage.getSelectOption();
        assertEquals(slectedOption.size(),1,"incorceet num of selesct");
        assertTrue(slectedOption.contains(option),"Option not seleted");


    }
}
