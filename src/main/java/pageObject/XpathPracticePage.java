package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;

/**
 * Created by Andriy on 23.04.2017.
 */
public class XpathPracticePage extends AbstractPageObject{

    public XpathPracticePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Practice Automation Form']")
    private WebElement titleOfPage;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/legend/strong")
    private WebElement titleOfForm;

    @FindBy(xpath = "//*[@class='control-group']/a[1]")
    private WebElement partialLinkTest;

    @FindBy(xpath = "//a[@title='Automation Practice Table']")
    private WebElement linkTest;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[1]/input[1]")
    private WebElement firstNameTitle;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[1]/input[2]")
    private WebElement lastNameTitle;

    @FindBy(xpath = "//*[@class='control-group wpoi-filled']/strong/label")
    private WebElement sexTitle;

    @FindBy(xpath = "//*[@id='sex-0']")
    private WebElement maleRadioButton;

    @FindBy(xpath = "//*[@id='sex-1']")
    private WebElement femaleRadioButton;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[3]/strong/label")
    private WebElement yearsOfExperimentsTitle;

    @FindBy(xpath = "//*[@id='exp-0']")
    private WebElement one;

    @FindBy(xpath = "//*[@id='exp-1']")
    private WebElement two;

    @FindBy(xpath = "//*[@id='exp-2']")
    private WebElement three;

    @FindBy(xpath = "//*[@id='exp-3']")
    private WebElement four;

    @FindBy(xpath = "//*[@id='exp-4']")
    private WebElement five;

    @FindBy(xpath = "//*[@id='exp-5']")
    private WebElement six;

    @FindBy(xpath = "//*[@id='exp-6']")
    private WebElement seven;

    @FindBy(xpath = "//*[@id='datepicker']")
    private WebElement dateField;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[4]/strong/label")
    private WebElement proffessionTitle;

    @FindBy(xpath = "//*[@id='profession-0']")
    private WebElement manualTesterCheckbox;

    @FindBy(xpath = "//*[@id='profession-1']")
    private WebElement automationTesterCheckbox;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[5]/strong/label")
    private WebElement prifilePictureTitle;

    @FindBy(xpath = "//*[@id='photo']")
    private WebElement uploadPhotoButton;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[7]/strong")
    private WebElement downloadFrameworkTitle;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[8]/a")
    private WebElement seleniumAutimationLink;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[9]/a")
    private WebElement testFileToDownload;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[11]/strong/label")
    private WebElement automationToolTitle;

    @FindBy(xpath = "//*[@id='tool-0']")
    private WebElement qtpCheckbox;

    @FindBy(xpath = "//*[@id='tool-1']")
    private WebElement seleniumIdeCheckbox;

    @FindBy(xpath = ".//*[@id='tool-2']")
    private WebElement seleniumWebDriverCheckbox;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[12]/p/strong/label")
    private WebElement continentsTitle;

    @FindBy(xpath = "//*[@id='continents']")
    private WebElement continentsDropBox;

    @FindBy(xpath = "//*[@id='content']/form/fieldset/div[13]/p/strong/label")
    private WebElement seleniumCommandsTitle;

    @FindBy(xpath = "//*[@id='selenium_commands']/option[1]")
    private WebElement browserCommandsValue;

    @FindBy(xpath = "//*[@id='selenium_commands']/option[2]")
    private WebElement navigationCommandsValue;

    @FindBy(xpath = "//*[@id='selenium_commands']/option[3]")
    private WebElement switchCommandsValue;

    @FindBy(xpath = "//*[@id='selenium_commands']/option[4]")
    private WebElement waitCommandsValue;

    @FindBy(xpath = "//*[@id='selenium_commands']/option[5]")
    private WebElement webElementCommandsValue;

    @FindBy(xpath = "//*[@id='submit']")
    private WebElement submitButton;

    public void clickOnTitlePage(){
        titleOfPage.click();
        titleOfForm.click();
        partialLinkTest.click();
        linkTest.click();
    }

    public void openPage(){
        driver.get("http://www.toolsqa.com/automation-practice-form/");
    }

}
