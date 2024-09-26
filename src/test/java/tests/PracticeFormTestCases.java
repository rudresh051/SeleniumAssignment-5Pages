package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.PracticeForm;

public class PracticeFormTestCases extends BaseTest {
	private PracticeForm PracticeFormVariable;
	
	@BeforeClass
	public void setup() {
		PracticeFormVariable = new PracticeForm();
	}
	
	@Test(priority = 1)
	public void TestCaseEnterFirstName() throws InterruptedException {
		PracticeFormVariable.clickOnFirstNameInput();
		Thread.sleep(5000);
		PracticeFormVariable.clickOnFirstNameInput("Rudreshwar Jha");
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void TestCaseEnterLastName() {
		PracticeFormVariable.clickOnLastNameInput("Rudreshwar Jha");
	}
	
}
