package searchGoogle;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.EnterResultingPage;
import tasks.IsHomePageDisplayed;
import tasks.IsValidSearch;
import tasks.SearchInGoogle;

import java.io.IOException;

public class SearchGoogleTest extends BaseTest {

    String wordToSearch = "Falabella Peru";

    @Test ( priority = 1 )
    public void testSearchGoogle() throws IOException {
        SearchInGoogle.as(webDriver,wordToSearch);
        Assert.assertTrue(IsValidSearch.validSearch(webDriver));
    }

    @Test ( priority = 2 )
    public void testDisplayHomePage() throws IOException {
        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultingPage.on(webDriver);
        Assert.assertTrue(IsHomePageDisplayed.corousel(webDriver));
    }

}
