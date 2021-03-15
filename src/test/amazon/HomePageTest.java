package test.amazon;

import main.java.Utils.Constants;
import main.java.pageEvents.HomePageEvents;
import org.testng.annotations.Test;
import test.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void searchFromHomePage() {
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.searchItem(Constants.searchText);
        homePageEvents.isSearchResultLoaded();
    }
}
