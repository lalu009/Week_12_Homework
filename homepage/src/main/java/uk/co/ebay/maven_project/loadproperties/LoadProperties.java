package uk.co.ebay.maven_project.loadproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    static Properties prop;
    static FileInputStream input;

    String projectPath = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\uk\\co\\ebay\\maven_project\\resources\\propertiesfile\\confige.properties ");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return prop.getProperty(key);


    }

}
