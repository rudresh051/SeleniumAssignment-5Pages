package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuAppDynamicPageElements {
	private WebDriver driver;
	private WebDriverWait wait;
	
	// Constructor
	public HerokuAppDynamicPageElements(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(xpath = "//a[@href='/dynamic_loading/1']") WebElement example1;
	@FindBy(xpath = "//a[@href='/dynamic_loading/2']") WebElement example2;
	@FindBy(xpath = "//button[text()='Start']") WebElement startButton;
	@FindBy(xpath = "//h4[text()='Hello World!']") WebElement helloWorldText;
	
	
	// Methods
	public void clickOnExample1() throws InterruptedException {
		example1.click();
		startButton.click();
		wait.until(ExpectedConditions.visibilityOf(helloWorldText));
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	public void clickOnExample2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(example2));
		example2.click();
		startButton.click();
		wait.until(ExpectedConditions.visibilityOf(helloWorldText));
		Thread.sleep(3000);
	}
	
	
}
