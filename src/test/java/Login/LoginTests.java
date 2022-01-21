package Login;

import Base.BaseTests;
import Pages.LoginPage;
import Pages.LoginToSecureAreapage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class LoginTests extends BaseTests {

    @Test
    public void TestSuccessfulLogin(){
        LoginPage loginPage=homepage.clickFormAuthenticon();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        LoginToSecureAreapage toSecureAreapage=loginPage.ClickLogin();
        Assert.assertTrue(toSecureAreapage.getAlertTest().contains("You logged into a secure area!"),"arter text incoorect");


    }

}
