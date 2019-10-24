package uk.co.next.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.next.loadproperties.LoadProperty;
import uk.co.next.pages.HomePage;
import uk.co.next.testbase.TestBase;

public class HomePageTest extends TestBase {
   HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test

    public void userShouldNavigateToNextHomePage() {

        String expectedText = "Next Official Site: Online Fashion, Kids Clothes & Homeware";

        Assert.assertEquals(expectedText,homePage.getHomePageTitle());


    }
}
