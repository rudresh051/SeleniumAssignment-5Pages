package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    // Initialize the WebDriver only if not already initialized
    public static void initializeDriver() {
        if (driver == null) {  // Check if the driver is already initialized
            WebDriverManager.chromedriver().setup();  // Use WebDriverManager to setup the ChromeDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set an explicit wait
        }
    }

    @BeforeSuite
    public void setUpSuite() {
        try {
            initializeDriver(); // Use the initializeDriver method to avoid duplication
            driver.get("https://demoqa.com/automation-practice-form"); // Load the URL here
        } catch (Exception e) {
            System.out.println("Error during setup: " + e.getMessage());
            e.printStackTrace();
            throw e;  // Re-throw to ensure the suite fails if setup fails
        }
    }

    @AfterSuite
    public void tearDownSuite() {
        if (driver != null) {
            driver.quit();  // Quit the browser after the suite execution
        }
    }
}
