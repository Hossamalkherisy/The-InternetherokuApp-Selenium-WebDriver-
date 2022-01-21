package Alert;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpLoad(){
        var uploadpage=homepage.clickFileUpload();

        uploadpage.uploadfile("F:\\Software Testing\\the-internetherokuapp\\Resources\\ss.jpg");
        Assert.assertEquals(uploadpage.getuploadeFile(),"ss.jpg","UploadFile incorrect");
    }
}
