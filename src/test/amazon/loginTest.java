package test.amazon;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;
import test.BaseTest;

public class loginTest extends BaseTest {

    @Test
    public void testLogin(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignIn();

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.isLoginPageLoaded();
        loginPageEvents.enterLoginDetails();
    }
}
