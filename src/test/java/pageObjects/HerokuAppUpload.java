package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppUpload {
	private WebDriver driver;

// Constructor
	public HerokuAppUpload(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
// Locators
	
	@FindBy(id="file-upload") WebElement fileUploadInput;
	@FindBy(id="file-submit") WebElement fileSubmitButton;
	
	
// Methods
	
	public void uploadFile(String filePath) {
		fileUploadInput.sendKeys(filePath);
		fileSubmitButton.click();
	}
	
}
