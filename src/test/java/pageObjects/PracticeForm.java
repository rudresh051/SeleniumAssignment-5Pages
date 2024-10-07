package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {
	private WebDriver driver;
	private Actions actions;
	
	public PracticeForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	// Find all WebElements and put it here as variable
	// create methods of operation to be performed on WebElements
	
	@FindBy(xpath = "//input[@id='firstName']") WebElement firstName;
	@FindBy(xpath = "//input[@id='lastName']") WebElement lastName;
	@FindBy(xpath = "//input[@id='userEmail']") WebElement userEmail;
	@FindBy(xpath = "//label[normalize-space()='Male']") WebElement userGender;
	
	
	// Methods
	public void clickOnFirstNameInput() {
		firstName.click();
	}
	
	public void clickOnFirstNameInput(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void clickOnLastNameInput(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void clickOnEmailInput(String email) {
		userEmail.sendKeys(email);
	}
	
	public void clickOnGenderButton() {
		userGender.click();
	}
	
	
	
}
