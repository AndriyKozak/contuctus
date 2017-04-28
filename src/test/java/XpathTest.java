import functionality.XpathPracticeFunctionality;
import org.testng.annotations.Test;
import testng.AbstractTestCase;

/**
 * Created by Andriy on 28.04.2017.
 */
public class XpathTest extends AbstractTestCase {

    private XpathPracticeFunctionality xpathPracticeFunctionality;

    @Test
    public void clickOnElements(){
        xpathPracticeFunctionality = new XpathPracticeFunctionality();
        xpathPracticeFunctionality.clickOnElements();
    }
}
