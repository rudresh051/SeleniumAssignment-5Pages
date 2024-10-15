package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuAppDynamicControls {

	private WebDriver driver;
	private WebDriverWait wait;
	
	// Constructor
	public HerokuAppDynamicControls(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(xpath = "//input[@type='checkbox']") WebElement checkBoxButton;
	@FindBy(xpath = "//button[text()='Remove']") WebElement removeButton;
	@FindBy(xpath = "//button[text()='Add']") WebElement addButton;
	@FindBy(id = "message") WebElement goneText;
	
	
	// Methods
	public void clickOnCheckBox() {
		checkBoxButton.click();
	}
	
	public void clickOnRemoveButton() {
		removeButton.click();
	}
	
	public void clickOnAddButton() {
		wait.until(ExpectedConditions.visibilityOf(goneText));
		addButton.click();
	}
	
	
	
}
