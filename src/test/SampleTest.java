package test;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Parameters({"browserName", "chrome"})
    @Test
    public void testLogin() {
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignIn();

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.isLoginPageLoaded();
        loginPageEvents.enterLoginDetails();
    }
}
