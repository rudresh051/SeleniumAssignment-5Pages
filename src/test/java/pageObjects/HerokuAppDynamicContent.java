package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppDynamicContent {

	
	private WebDriver driver;
	
	// Constructor
	public HerokuAppDynamicContent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(xpath = "//a[@href='/dynamic_content?with_content=static']") WebElement clickHereButton;
	
	
	// Methods
	public void clickOnButton() {
		clickHereButton.click();
	}
}
