package uk.co.ebay.maven_project.pages;

import utility.Util;

public class HomePage extends Util {


    public String getHomePageTitle() {
        return
                driver.getTitle();

    }


}

