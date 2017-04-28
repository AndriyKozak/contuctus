package utils;

import utils.driver.BrowserType;
import utils.env.Environment;

import java.util.ResourceBundle;

/**
 * Created by Andriy on 13.04.2017.
 */
public class PropertyManager {

    private static String browserName;
    private static ResourceBundle bundle;
    private static int implicitWait;
    // TODO: 4/20/2017 Take URL from properties
    private static String baseUrl;

    public static void getProperties() {
        bundle = ResourceBundle.getBundle("contuctus");
        browserName = bundle.getString("browser.type");
        implicitWait = Integer.parseInt(bundle.getString("implicit.wait"));
        baseUrl = bundle.getString("base.url");
    }

    public static BrowserType getBrowserType() {
        getProperties();

        BrowserType returnBrowserType = null;

        for (BrowserType browserType : BrowserType.values()) {
            if (browserName.equalsIgnoreCase(browserType.toString())) {
                returnBrowserType = browserType;
                break;
            }
        }
        return returnBrowserType;
    }

    public static int getImplicitWait(){
        getProperties();
        return implicitWait;
    }

    // TODO: 4/20/2017 Create method to get URL
    public static Environment getUrl() {
        getProperties();

        Environment returnEnvironment = null;

        for (Environment environment : Environment.values()) {
            if (baseUrl.equalsIgnoreCase(environment.name())) {
                returnEnvironment = environment;
                break;
            }
        }
        return returnEnvironment;
    }

}
