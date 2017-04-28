import data.User;
import data.UserRepository;
import functionality.IxlooComFunctionality;
import org.testng.annotations.Test;
import testng.AbstractTestCase;

/**
 * Created by Andriy on 03.04.2017.
 */
public class FillContactUsFormTest extends AbstractTestCase {

    private User ixlooUser = UserRepository.getIxlooUser();
    private User ixlooUserWithComments = UserRepository.getIxlooUserWithComments();
    private User ixlooUserWhithoutZip = UserRepository.getIxlooUserWhithoutZip();

    private IxlooComFunctionality ixlooComFunctionality;


    @Test(description = "Fill fields without comments")
    public void testWithoutComments() {
        ixlooComFunctionality = new IxlooComFunctionality();
        ixlooComFunctionality.openIxlooPage();
        ixlooComFunctionality.fillContactUs(ixlooUser);
    }

    //TODO: Create test to leave ZIP field empty
    @Test (description = "Fill fields without ZIP", dependsOnMethods = "testWithComments")
    public void testWithoutZip(){
        ixlooComFunctionality.openIxlooPage();
        ixlooComFunctionality.fillContactUs(ixlooUserWhithoutZip);
        ixlooComFunctionality.checkZipError();
    }

    //TODO: Create test to fill Comments field
    @Test (description = "Fill fields with comments", dependsOnMethods = "testWithoutComments")
    public void testWithComments(){
        ixlooComFunctionality.openIxlooPage();
        ixlooComFunctionality.fillContactUsWithComments(ixlooUserWithComments);
    }
}
