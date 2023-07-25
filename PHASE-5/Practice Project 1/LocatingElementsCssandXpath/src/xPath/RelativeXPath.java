package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {
    public static void main(String[] args) {
        // Set ChromeDriver system property
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.amazon.in/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Absolute XPath
        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/div/a ")).click();

        // Close the browser
       // driver.quit();
    }
}
