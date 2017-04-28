package pageObject;

import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;
import utils.PropertyManager;
import utils.env.EnvironmentFactory;

/**
 * Created by Andriy on 03.04.2017.
 */
public class ContactUsFormPage extends AbstractPageObject{

    public ContactUsFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='first_name']")
    private WebElement firstName;

    @FindBy(css = "input[name='last_name']")
    private WebElement lastName;

    @FindBy(css = "input[name='phone']")
    private WebElement phone;

    @FindBy(css = "input[name='email']")
    private WebElement email;

    @FindBy(css = "input[name='international_phone']")
    private WebElement internationalphone;

    @FindBy(css = "input[name='street']")
    private WebElement street;

    @FindBy(css = "input[name='city']")
    private WebElement city;

    @FindBy(css = "input[name='state']")
    private WebElement state;

    @FindBy(css = "input[name='zip']")
    private WebElement zip;

    @FindBy(css = "textarea[name='comments']")
    private WebElement comments;

    @FindBy(css = ".panel-body > form > div > div > span:nth-of-type(2)")
    private WebElement submitButton;

    public void fillContactInformation(User user){
        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        phone.sendKeys(user.getPhone());
        email.sendKeys(user.getEmail());
        internationalphone.sendKeys(user.getInternationalphone());
        street.sendKeys(user.getStreet());
        city.sendKeys(user.getCity());
        state.sendKeys(user.getState());
        zip.sendKeys(user.getZip());
    }

    // TODO: Create a user page object with Comments
    public void fillContactInformationWithComments(User user){
        fillContactInformation(user);
        comments.sendKeys(user.getComments());
    }

    public void clickSubmit(){
        submitButton.click();
    }

    public String getZipColor() {
        return driver.findElement(By.xpath("//label[contains(text(), \"Zip/Postal Code:\")]/..")).getAttribute("class");
    }

    public void openIxlooPage(){
        driver.get(EnvironmentFactory.chooseEnvironment().toString() + "contactus/");
    }
}
