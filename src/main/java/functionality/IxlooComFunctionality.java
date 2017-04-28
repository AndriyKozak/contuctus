package functionality;

import data.User;
import org.testng.Assert;
import pageObject.ContactUsFormPage;
import pageObject.PostSubmit;
import utils.driver.DriverFactory;

/**
 * Created by Andriy on 03.04.2017.
 */
public class IxlooComFunctionality {

    private ContactUsFormPage contactUsFormPage;
    private PostSubmit postSubmitPage;

    public void openIxlooPage(){
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        contactUsFormPage.openIxlooPage();
    }

    public void fillContactUs(User user) {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        contactUsFormPage.fillContactInformation(user);
        contactUsFormPage.clickSubmit();
    }

    // TODO: Create a user functionality with Comments
    public void fillContactUsWithComments(User user) {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        contactUsFormPage.fillContactInformationWithComments(user);
        contactUsFormPage.clickSubmit();
        postSubmitPage = new PostSubmit(DriverFactory.getDriver());
        String title = postSubmitPage.getTitleOfFormText();
        String content = postSubmitPage.getContentText();
        String buttonText = postSubmitPage.getButtonOkTest();
        Assert.assertTrue(title.contains("Contact Us"));
        Assert.assertTrue(content.contains("Your request has been received.\n" +
                "A customer service representative will contact you shortly to complete the transaction.\n" +
                "\n" +
                "Thank you for using Best Dealer service."));
        Assert.assertTrue(buttonText.contains("OK"));
    }

    // TODO: Create a user without ZIP
    public void fillContactUsWithoutZip(User user) {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        contactUsFormPage.fillContactInformation(user);
        contactUsFormPage.clickSubmit();
    }

    public void checkZipError() {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        String zipColorError = contactUsFormPage.getZipColor();
        Assert.assertTrue(zipColorError.contains("error"), "Zip color is not red!");
    }
}

