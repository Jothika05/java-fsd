package AutomateEcommerce.AutomateEcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ecommerce {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void ecommerce_test() throws InterruptedException {
        // Calculate page load time
        long start = System.currentTimeMillis();
        driver.get("https://www.flipkart.com/");
        long finish = System.currentTimeMillis();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/");
        long totalTime = finish - start;
        System.out.println("Total Time for page load: " + totalTime + " milliseconds");

        // Close the login popup if present
        try {
            WebElement popupCloseButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
            if (popupCloseButton.isDisplayed() && popupCloseButton.isEnabled()) {
                popupCloseButton.click();
            }
        } catch (Exception e) {
            // Ignore exception if the popup is not present
        }

        // Verify page title
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        System.out.println("The page Title is: " + driver.getTitle());

        // Search for "iPhone 13"
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='container']//input[@type='text']"));
        searchBox.sendKeys("iPhone 13");
        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.xpath("//*[@id='container']//button[@type='submit']"));
        Assert.assertTrue(searchButton.isEnabled());
        searchButton.click();
        Thread.sleep(2000);

        // Check if the image is loaded on the page
        WebElement iphoneImage = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Starlight, 128 GB)']"));
        Boolean isImageLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
                iphoneImage);

        if (isImageLoaded) {
            System.out.println("Image Loaded");
        } else {
            System.out.println("Image not Loaded");
        }

        // Page scroll feature
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.navigate().refresh();
        js.executeScript("window.scrollBy(0, -500)", "");
        Thread.sleep(6000);
        System.out.println("Page Scrolling Working");
        Thread.sleep(6000);

        // Page scroll to bottom
        driver.navigate().refresh();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        System.out.println("Navigating to Bottom of Page");

        // Image loading while scrolling
        driver.navigate().refresh();
        js.executeScript("window.scrollBy(0, 500)", "");
        Thread.sleep(3000);
        WebElement pinkIphoneImage = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Pink, 128 GB)']"));
        Boolean isImageLoadingWhileScrolling = (Boolean) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
                pinkIphoneImage);

        if (isImageLoadingWhileScrolling) {
            System.out.println("Image downloading while scrolling");
        } else {
            System.out.println("Image not Loaded");
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
