import data.User;
import data.UserRepository;
import functionality.IxlooComFunctionality;
import org.testng.annotations.Test;
import testng.AbstractTestCase;

/**
 * Created by Andriy on 13.04.2017.
 */
public class TestDriverProperty extends AbstractTestCase {

    private IxlooComFunctionality ixlooComFunctionality;
    private User user = UserRepository.getIxlooUser();

    @Test
    public void openChrome() {
        ixlooComFunctionality = new IxlooComFunctionality();
        ixlooComFunctionality.openIxlooPage();
        ixlooComFunctionality.fillContactUs(user);
    }
}
