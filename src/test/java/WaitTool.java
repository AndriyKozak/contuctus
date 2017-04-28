import com.google.common.base.Function;
import functionality.AutomationPracticeFunctionality;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.AutomationPracticePage;

import java.util.concurrent.TimeUnit;

public class WaitTool {

    AutomationPracticePage automationPracticePage;
    AutomationPracticeFunctionality automationPracticeFunctionality;

    private WebDriver driver;

    @BeforeTest
    public void runBrowser() {

        driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        automationPracticePage = new AutomationPracticePage(driver);
        automationPracticeFunctionality = new AutomationPracticeFunctionality(driver);
    }

    @Test (description = "wait until color of button to be red")
    public void checkColorOfRedButton(){
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(15, TimeUnit.SECONDS);

        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver arg0) {
                WebElement element = arg0.findElement(By.id("colorVar"));
                String color = element.getAttribute("style");
                System.out.println("The color if the button is " + color);
                if (color.contains("red")) {
                    return true;
                }
                return false;
            }
        };

        wait.until(function);
    }

    @Test (description = "Doubleclick and wait that color of button to be orange")
    public void checkColorOfOrangeButton(){
        automationPracticeFunctionality.checkColorOfOrangeButton();
    }

    @Test (description = "wait until timing alert is present")
    public void checkTimingAlert(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        automationPracticePage.clickOnTimingAlertButton();
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Test (description = "wait until alert is present")
    public void checkAlertBox(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        automationPracticePage.clickOnAlertBoxButton();
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Test(description = "Wait until number of windows to be 2")
    public void numbersOfWindow2(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        automationPracticePage.clickOnNewBrowserWindowButton();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @AfterTest
    public void browserQuit(){
        driver.quit();
    }

    @Test
    public void waitForElementPresent() {


        driver = new FirefoxDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(15, TimeUnit.SECONDS);

        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver arg0) {
                WebElement element = arg0.findElement(By.id("colorVar"));
                String color = element.getAttribute("style");
                System.out.println("The color if the button is " + color);
                if (color.contains("red")) {
                    return true;
                }
                return false;
            }
        };

        wait.until(function);
    }

//    @Test
//    public void predicateTest() {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
//
//        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//        wait.withTimeout(2, TimeUnit.MINUTES);
//        // wait.ignoring(NoSuchElementException.class); //make sure that this exception is ignored
//
//        Predicate<WebDriver> predicate = new Predicate<WebDriver>() {
//
//            public boolean apply(WebDriver arg0) {
//                WebElement element = arg0.findElement(By.id("colorVar"));
//                String color = element.getAttribute("style");
//                System.out.println("The color if the button is " + color);
//                if (color.contains("red")) {
//                    return true;
//                }
//                return false;
//            }
//        };
//        wait.until(predicate);
//    }

    @Test
    public void returnWebelementFluentWail() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(2, TimeUnit.MINUTES);
        wait.ignoring(NoSuchElementException.class); //make sure that this exception is ignored
        Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver arg0) {
                System.out.println("Checking for the element!!");
                WebElement element = arg0.findElement(By.id("target"));
                if (element != null) {
                    System.out.println("Target element found");
                }
                return element;
            }
        };

        wait.until(function);
    }

}

//        Wait wait = new FluentWait(driver)
//
//                .withTimeout(30, SECONDS)
//
//                .pollingEvery(5, SECONDS)
//
//                .ignoring(NoSuchElementException.class);
//
//        WebElement foo = wait.until(new Function<WebDriver, Boolean>() {
//
//            @Override
//            public Boolean apply(WebDriver driver) {
//                return driver.findElement(By.id("id")).getText().equals("sdfs");
//            }
//
//
//
//
//
//        });
//        try {
//            // nullify implicitlyWait( )
//            driver.manage().timeouts()
//                    .implicitlyWait(0, TimeUnit.SECONDS);
//            // Create web element
//            WebElement webElement =
//                    new WebDriverWait(driver, timeOutInSecond)
//                            .until(new
//                                           ExpectedConditions<Boolean>() {
//                                               @Override
//                                               public Boolean apply(WebDriver d) {
//                                                   return isElementPresent(d, by);
//                                               }
//                                           });
//            // reset implicitlyWait( )
//            driver.manage().timeouts()
//                    .implicitlyWait(10, TimeUnit.SECONDS);
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }


//    driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
//    // Click on the Button "Timing Alert"
//         driver.findElement(By.name("Timing Alert")).click();
//
//         System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
//    // Create new WebDriver wait
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    // Wait for Alert to be present
//    Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
//         System.out.println("Either Pop Up is displayed or it is Timed Out");
//    // Accept the Alert
//         myAlert.accept();
//         System.out.println("Alert Accepted");
//    // Close the main window
//         driver.close();
