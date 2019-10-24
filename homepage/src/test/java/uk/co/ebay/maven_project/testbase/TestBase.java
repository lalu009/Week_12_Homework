package uk.co.ebay.maven_project.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.ebay.maven_project.basepage.BasePage;
import uk.co.ebay.maven_project.browserselector.BrowserSelector;
import uk.co.ebay.maven_project.loadproperties.LoadProperties;

public class TestBase extends BasePage {

    String browser =new LoadProperties().getProperty("browser");
    BrowserSelector browserSelector= new BrowserSelector();

        @BeforeMethod
    public void setup(){browserSelector.selectBrowser(browser); }

    @AfterMethod
    public void tearDown(){
    driver.quit();
    }


}
