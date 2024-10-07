package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	  public static void initializeDriver() {
	        if (driver == null) { // Check if driver is already initialized
	            WebDriverManager.chromedriver().setup();
	            
//	            ChromeOptions options = new ChromeOptions();
//	            options.addArguments("--headless");  // Enable headless mode
//	            options.addArguments("--disable-gpu");  // Disable GPU acceleration
//	            options.addArguments("--window-size=1920,1080");  // Set window size
//	            options.addArguments("--disable-extensions");  // Disable extensions
//	            options.addArguments("--disable-popup-blocking");  // Disable popups
	            
	            
	            driver = new ChromeDriver();
//	            driver = new ChromeDriver(options);  // Initialize ChromeDriver with options
	            driver.manage().window().maximize();
	            wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 

	        }
	    }

	@BeforeSuite
	public void setUpSuite() {
		try {
			WebDriverManager.chromedriver().setup();
			
			 // Setup ChromeOptions for headless mode
//			ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");  // Enable headless mode
//            options.addArguments("--disable-gpu");  // Disable GPU acceleration
//            options.addArguments("--window-size=1920,1080");  // Set window size
//            options.addArguments("--disable-extensions");  // Disable extensions
//            options.addArguments("--disable-popup-blocking");  // Disable popups
			
			
			driver = new ChromeDriver();
//            driver = new ChromeDriver(options);  // Initialize ChromeDriver with options
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");  // Load the URL here
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName"))); // Wait for first name input to be visible

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error during setup: " + e.getMessage());
			e.printStackTrace();
			throw e;  // Re-throw to ensure the suite fails if setup fails
		}

	}

	@AfterSuite
	public void tearDownSuite() {
		if (driver != null) {
			driver.quit();
		}
	}
}
