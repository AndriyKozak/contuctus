import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Selenium2Example {

    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // And now use this to visit Google
        driver.get("http://www.google.com");


        // Alternatively the same thing can be done like this
        // driver.navigate( ).to("http://www.google.com");
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys("Cheese!");
        element.submit();
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
/*
        (new WebDriverWait(driver, 10)).
                until(new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return d.getTitle().toLowerCase().startsWith("cheese!");
                    }
                });
*/
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.titleContains("Cheese"));

        Assert.assertTrue(driver.getTitle().contains("Cheese!"));
        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        // Close the browser
        driver.quit();
    }
}




            // Google's search is rendered dynamically with JavaScript.
            // Wait for the page to load, timeout after 10 seconds

