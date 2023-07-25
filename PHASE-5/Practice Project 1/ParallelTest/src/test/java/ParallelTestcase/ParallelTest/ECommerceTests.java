package ParallelTestcase.ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ECommerceTests {
    private WebDriver wd;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
        wd = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        wd.quit();
    }

    @Test(groups = "ecommerce")
    public void flipkartSearchTest() {
        wd.get("https://www.google.com");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement googleSearchBar = wd.findElement(By.name("q"));
        googleSearchBar.sendKeys("flipkart samsung");
        googleSearchBar.sendKeys(Keys.ENTER);
        wd.get("https://www.flipkart.com/"); // Navigate directly to Flipkart website
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Close the login popup if it appears
        WebElement loginPopupCloseButton = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        if (loginPopupCloseButton.isDisplayed()) {
            loginPopupCloseButton.click();
        }

        WebElement flipkartSearchBar = wd.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        flipkartSearchBar.sendKeys("mobiles");
        flipkartSearchBar.sendKeys(Keys.ENTER);

        // Add any specific assertions or verifications related to the Flipkart search here
       // Assert.assertTrue(wd.getTitle().contains("Mobiles"), "Flipkart search results for Mobiles not displayed");
        // Add any specific assertions or verifications related to the Flipkart search here
    }

    @Test(groups = "ecommerce")
    public void amazonSearchTest() {
        wd.get("https://www.google.com");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement googleSearchBar = wd.findElement(By.name("q"));
        googleSearchBar.sendKeys("amazon samsung");
        googleSearchBar.sendKeys(Keys.ENTER);

        // Add any specific assertions or verifications related to the Amazon search here
    }

    @Test(groups = "education")
    public void simplilearnLoginTest() {
        wd.get("https://www.google.com");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement googleSearchBar = wd.findElement(By.name("q"));
        googleSearchBar.sendKeys("simplilearn login");
        wd.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
        googleSearchBar.sendKeys(Keys.ENTER);

        // Add any specific assertions or verifications related to the Simplilearn login here
    }
}

