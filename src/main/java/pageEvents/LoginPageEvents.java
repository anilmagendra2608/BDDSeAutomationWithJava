package main.java.pageEvents;

import main.java.Utils.Constants;
import main.java.Utils.ElementFetch;
import main.java.pageObjects.LoginPageElements;
import org.testng.Assert;

import javax.xml.bind.Element;

public class LoginPageEvents {
    public void isLoginPageLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.LoginPageLabel).size()>0, "Login Page did not open");
    }

    public void enterLoginDetails() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.emailTextBox).sendKeys(Constants.email);
    }
}
