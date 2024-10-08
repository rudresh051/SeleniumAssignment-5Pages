package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {
	private WebDriver driver;
	private Actions actions;
	private WebDriverWait wait;
	private Select sel;
	
	public PracticeForm(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		sel = new Select((WebElement) driver);
	}
	
	// Find all WebElements and put it here as variable
	// create methods of operation to be performed on WebElements
	
	@FindBy(xpath = "//input[@id='firstName']") WebElement firstName;
	@FindBy(xpath = "//input[@id='lastName']") WebElement lastName;
	@FindBy(xpath = "//input[@id='userEmail']") WebElement userEmail;
	@FindBy(xpath = "//label[normalize-space()='Male']") WebElement userGender;
	@FindBy(xpath = "//input[@id='userNumber']") WebElement userNumber;
	
	@FindBy(xpath = "//input[@id='dateOfBirthInput']") WebElement userDateOfBirth;
	@FindBy(xpath = "(//select[@class='react-datepicker__month-select'])[3]") WebElement userMonthDOB;
	@FindBy(xpath = "(//select[@class='react-datepicker__year-select'])[95]") WebElement userYearDOB;
	@FindBy(xpath = "react-datepicker__day react-datepicker__day--014 react-datepicker__day--weekend") WebElement userDateDOB;
	
	
	
	@FindBy(xpath = "//input[@id='subjectsInput']") WebElement userSubjects;
	@FindBy(xpath = "//label[@for='hobbies-checkbox-1']") WebElement userHobbies1;
	@FindBy(xpath = "//label[@for='hobbies-checkbox-2']") WebElement userHobbies2;
	@FindBy(xpath = "//label[@for='hobbies-checkbox-3']") WebElement userHobbies3;
	@FindBy(xpath = "//input[@id='uploadPicture']") WebElement userPicture;
	@FindBy(xpath = "//input[@id='currentAddress']") WebElement userCurrentAddress;
	
	
	
	// Methods
	public void clickOnFirstNameInput() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", firstName);
		wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.click();
	}
	
	public void clickOnFirstNameInput(String firstname) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", firstName);
		wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys(firstname);
	}
	
	public void clickOnLastNameInput(String lastname) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", lastName);
		wait.until(ExpectedConditions.visibilityOf(lastName));
		lastName.sendKeys(lastname);
	}
	
	public void clickOnEmailInput(String email) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", userEmail);
		wait.until(ExpectedConditions.visibilityOf(userEmail));
		userEmail.sendKeys(email);
	}
	
	public void clickOnGenderButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", userGender);
		wait.until(ExpectedConditions.elementToBeClickable(userGender));
		userGender.click();
	}
	
	public void enterUserNumber() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", userNumber);
		wait.until(ExpectedConditions.visibilityOf(userNumber));
		userNumber.sendKeys("123456789");
	}
	
	
	public void enterDateOfBirth() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", userDateOfBirth);
		userDateOfBirth.click();
	}
	
	
	public void enterUserSubjects() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", userSubjects);
		wait.until(ExpectedConditions.visibilityOf(userSubjects));
		userSubjects.sendKeys("Computer Science");
		userSubjects.sendKeys(Keys.ENTER);
	}
	
	public void checkUserHobbies1() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()", userHobbies1);
//		wait.until(ExpectedConditions.visibilityOf(userHobbies1));
		userHobbies1.click();
	}
	
	public void checkUserHobbies2() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()", userHobbies2);
//		wait.until(ExpectedConditions.visibilityOf(userHobbies2));
		userHobbies2.click();
	}
	
	public void checkUserHobbies3() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()", userHobbies3);
//		wait.until(ExpectedConditions.visibilityOf(userHobbies3));
		userHobbies3.click();
	}
	
}
