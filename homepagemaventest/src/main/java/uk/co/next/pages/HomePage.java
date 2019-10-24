package uk.co.next.pages;

import org.openqa.selenium.By;
import uk.co.next.utilily.Util;

public class HomePage extends Util {



    public String getHomePageTitle() {
        return
                driver.getTitle();
    }


}
