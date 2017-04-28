package functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.AutomationPracticePage;

/**
 * Created by Andriy on 4/13/2017.
 */
public class AutomationPracticeFunctionality {

    WebDriver driver;

    AutomationPracticePage automationPracticePage;

    public AutomationPracticeFunctionality(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // TODO: Doubleclick on button to make it red
    public void checkColorOfOrangeButton(){
        automationPracticePage = new AutomationPracticePage(driver);
        automationPracticePage.doubleClickOnChangeColorOrangeButton();
        WebElement getChangeColorOrangeButton = automationPracticePage.getChangeColorOrangeButton();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.attributeToBe(getChangeColorOrangeButton, "style", "color: orange;"));
        org.testng.Assert.assertTrue(getChangeColorOrangeButton.getAttribute("style").contains("color: orange"));
    }


    // TODO: Check color of red button
    public void checkColorOfRedButton(){
        String getColorRedButton = automationPracticePage.getChangeColorRedButton();
        org.testng.Assert.assertTrue(getColorRedButton.contains("red"), "The color is red!");
    }

    // TODO: Click on Alert button and wait for allert
    public void checkAlert(){

    }

    // TODO: Click on Alert Box button and wait for allert
    public void checkAlertBox(){

    }
}
