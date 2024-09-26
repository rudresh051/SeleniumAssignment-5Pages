package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {
	private WebDriver driver;
	private Actions actions;
	
	public PracticeForm() {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	@FindBy(xpath = "//input[@id='firstName']") WebElement firstName;
	@FindBy(xpath = "//input[@id='lastName']") WebElement lastName;
	@FindBy(xpath = "//input[@id='userEmail']") WebElement nameEmail;
	@FindBy(xpath = "//label[normalize-space()='Male']") WebElement gender;
	
	
	// Methods
	public void clickOnFirstNameInput() {
		firstName.click();
	}
	
	public void clickOnFirstNameInput(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void clickOnLastNameInput(String lastname) {
		firstName.sendKeys(lastname);
	}
	
}
