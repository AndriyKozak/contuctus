package utils.env;

import org.openqa.selenium.WebDriver;
import utils.AbstractPageObject;
import utils.PropertyManager;

/**
 * Created by Andriy on 4/20/2017.
 */

// TODO: 4/20/2017 Create Environment Factory to work with different environments
public class EnvironmentFactory extends AbstractPageObject {

    private static Environment environment;
    private static WebDriver driver;

    private EnvironmentFactory(WebDriver driver) {
        super(driver);
    }

    public static Environment chooseEnvironment() {
        if (environment == null) {
            switch (PropertyManager.getUrl()) {
                case QA:
                    environment = Environment.QA;
                    break;
                case STAGE:
                    environment = Environment.STAGE;
                    break;
                case PROD:
                    environment = Environment.PROD;
                    break;
                case DEV:
                    environment = Environment.DEV;
                    break;
            default:
                String[] links;
                links = new String[4];
                links[0]= "http://andriy.motorboxx.goxloo.com/";
                links[1]= "http://stage123.dxloo.com/";
                links[2]="http://andrijk.ixloo.com/";
                links[3]="http://julia2.dxloo.com/";
                for(int i = 0; i<links.length;i++)
                {
                    driver.get(links[i]);
                }
            }
        }
        return environment;
    }
}
