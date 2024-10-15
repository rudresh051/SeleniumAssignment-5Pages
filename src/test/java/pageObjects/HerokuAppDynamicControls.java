package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppDynamicControls {

	private WebDriver driver;
	
	// Constructor
	public HerokuAppDynamicControls(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(xpath = "//input[@type='checkbox']") WebElement checkBoxButton;
	@FindBy(xpath = "//button[text()='Remove']") WebElement removeButton;
	@FindBy(xpath = "//button[text()='Add']") WebElement addButton;
	
	
	// Methods
	public void clickOnCheckBox() {
		checkBoxButton.click();
	}
	
	public void clickOnRemoveButton() {
		removeButton.click();
	}
	
	public void clickOnAddButton() {
		addButton.click();
	}
	
	
	
}
