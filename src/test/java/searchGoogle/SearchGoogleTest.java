package searchGoogle;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.EnterResultigPage;
import tasks.IsHomePageDisplayed;
import tasks.IsValidSearch;
import tasks.SearchInGoogle;

public class SearchGoogleTest extends BaseTest {

    String wordToSearch = "Falabella Colombia";

    @Test ( priority = 1 )
    public void testSearchGoogle() {

        SearchInGoogle.as(webDriver,wordToSearch);
        Assert.assertTrue(IsValidSearch.validSearch(webDriver));
    }

    @Test ( priority = 2 )
    public void testDisplayHomePage() {
        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultigPage.on(webDriver);
        Assert.assertTrue(IsHomePageDisplayed.corousel(webDriver));
    }

}
