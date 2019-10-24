package uk.co.next.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.next.basepage.BasePage;
import uk.co.next.browserselector.BrowserSelector;
import uk.co.next.loadproperties.LoadProperty;

public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();;
    }

}


