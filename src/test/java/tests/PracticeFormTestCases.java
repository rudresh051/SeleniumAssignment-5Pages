package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.PracticeForm;

public class PracticeFormTestCases extends BaseTest {
	private PracticeForm PracticeFormVariable;
	
	@BeforeClass
	public void setup() {
		PracticeFormVariable = new PracticeForm(driver);
	}
	
	@Test(priority = 1)
	public void TestCaseEnterFirstName() throws InterruptedException {
		PracticeFormVariable.clickOnFirstNameInput();
		Thread.sleep(5000);
		PracticeFormVariable.clickOnFirstNameInput("Rudreshwar");
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void TestCaseEnterLastName() {
		PracticeFormVariable.clickOnLastNameInput("Rudreshwar");
	}
	
	@Test(priority = 3)
	public void TestCaseEnterUserEmail() {
		PracticeFormVariable.clickOnEmailInput("test@demoqa.com");
	}
	
	@Test(priority = 4)
	public void TestCaseSelectGender() throws InterruptedException {
		PracticeFormVariable.clickOnGenderButton();
		Thread.sleep(5000);
	}
	
}
