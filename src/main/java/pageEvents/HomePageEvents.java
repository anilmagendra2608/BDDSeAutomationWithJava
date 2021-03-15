package main.java.pageEvents;

import main.java.Utils.ElementFetch;
import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.LoginPageElements;
import org.testng.Assert;

public class HomePageEvents {

    public void clickOnSignIn() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.homePageLabel).click();
    }

    public void searchItem(String searchItem) {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.searchTextBox).click();
        elementFetch.getWebElement("XPATH", HomePageElements.searchTextBox).sendKeys(searchItem);
        elementFetch.getWebElement("XPATH", HomePageElements.searchButton).click();
    }

    public void isLoginPageLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.LoginPageLabel).size()>0, "Login Page did not open");
    }

    public void isSearchResultLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        //TODO : finish it later
    }
}
