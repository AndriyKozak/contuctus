package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;

/**
 * Created by Andriy on 4/13/2017.
 */
public class AutomationPracticePage extends AbstractPageObject {

    public AutomationPracticePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "button1")
    private WebElement newBrowserWindowButton;

    @FindBy(css = "#content > p:nth-of-type(3) > button")
    private WebElement newMessageWindowButton;

    @FindBy(css = "#content > p:nth-of-type(4) > button")
    private WebElement newBrowserTabButton;

    @FindBy(id = "alert")
    private WebElement alertBoxButton;

    @FindBy(id = "timingAlert")
    private WebElement timingAlertButton;

    @FindBy(id = "colorVar")
    private WebElement changeColorRedButton;

    @FindBy(id = "doubleClick")
    private WebElement changeColorOrangeButton;

    @FindBy(id = "disabledElement")
    private WebElement enabledButton;

    @FindBy(id = "invisibility")
    private WebElement visibleButton;

    public void doubleClickOnChangeColorOrangeButton(){
    Actions action = new Actions(driver);
        action.doubleClick(changeColorOrangeButton).perform();
    }

    public void clickOnNewBrowserWindowButton(){
        newBrowserWindowButton.click();
    }

    public void clickOnNewMessageWindowButton(){
        newMessageWindowButton.click();
    }

    public void clickOnNewBrowserTabButton(){
        newBrowserTabButton.click();
    }

    public void clickOnAlertBoxButton(){
        alertBoxButton.click();
    }

    public void clickOnTimingAlertButton(){
        timingAlertButton.click();
    }

    public void clickOnChangeColorRedButton(){
        changeColorRedButton.click();
    }

    public void clickOnChangeColorOrangeButton(){
        changeColorOrangeButton.click();
    }

    public void clickOnEnabledButton(){
        enabledButton.click();
    }

    public void clickOnVisibleButton(){
        visibleButton.click();
    }

    public WebElement getChangeColorOrangeButton() {
        return changeColorOrangeButton;
    }

    public String getChangeColorRedButton() {
        return changeColorRedButton.getAttribute("color");
    }
}
