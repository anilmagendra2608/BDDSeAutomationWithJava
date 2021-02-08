package main.java.pageEvents;

import main.java.Utils.ElementFetch;
import main.java.pageObjects.HomePageElements;

public class HomePageEvents {
    public void clickOnSignIn() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.homePageLabel).click();
    }
}
