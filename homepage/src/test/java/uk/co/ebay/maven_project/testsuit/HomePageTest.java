package uk.co.ebay.maven_project.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.ebay.maven_project.loadproperties.LoadProperties;
import uk.co.ebay.maven_project.pages.HomePage;
import uk.co.ebay.maven_project.testbase.TestBase;

public class HomePageTest extends TestBase {

    HomePage homepage = new HomePage();

    LoadProperties loadProperties =new LoadProperties();

    @Test

    public void userShouldNavigateToHomePageSuccessfully(){
        String expectedText = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
        Assert.assertEquals(expectedText,homepage.getHomePageTitle());
        
    }



    }

