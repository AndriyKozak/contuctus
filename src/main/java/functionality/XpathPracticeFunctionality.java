package functionality;

import pageObject.XpathPracticePage;
import utils.driver.DriverFactory;

/**
 * Created by Andriy on 28.04.2017.
 */
public class XpathPracticeFunctionality {

    private XpathPracticePage practicePage;

    public void clickOnElements(){
        practicePage = new XpathPracticePage(DriverFactory.getDriver());
        practicePage.openPage();
        practicePage.clickOnTitlePage();
        practicePage.clickOnTitlePage();
    }
}
