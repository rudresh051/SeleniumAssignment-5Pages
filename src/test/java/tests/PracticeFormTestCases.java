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
		PracticeFormVariable.clickOnLastNameInput("Jha");
	}
	
	@Test(priority = 3)
	public void TestCaseEnterUserEmail() {
		PracticeFormVariable.clickOnEmailInput("test@demoqa.com");
	}
	
	@Test(priority = 4)
	public void TestCaseSelectGender() throws InterruptedException {
		PracticeFormVariable.clickOnGenderButton();
	}
	
	@Test(priority = 5)
	public void TestCaseEnterNumber() throws InterruptedException {
		PracticeFormVariable.enterUserNumber();
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void TestCaseEnterSubjects() {
		PracticeFormVariable.enterUserSubjects();
	}
	
	@Test(priority = 7)
	public void TestCaseCheckHobbies1() {
		PracticeFormVariable.checkUserHobbies1();
	}
	
	@Test(priority = 8)
	public void TestCaseCheckHobbies2() {
		PracticeFormVariable.checkUserHobbies2();
	}
	
	@Test(priority = 9)
	public void TestCaseCheckHobbies3() throws InterruptedException {
		PracticeFormVariable.checkUserHobbies3();
		Thread.sleep(3000);
	}
	
	
	
}
