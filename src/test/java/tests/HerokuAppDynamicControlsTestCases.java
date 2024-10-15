package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.HerokuAppDynamicControls;

public class HerokuAppDynamicControlsTestCases extends BaseTest{
	private HerokuAppDynamicControls herokuAppDynamicControlsVariable;
	
	@BeforeClass
	public void setUpDynamicControl() {
		   ((JavascriptExecutor) driver).executeScript("window.open('https://the-internet.herokuapp.com/dynamic_controls', '_blank');");

		// Switch to the new tab
		    for (String windowHandle : driver.getWindowHandles()) {
		        driver.switchTo().window(windowHandle);
		    }
		    
		    herokuAppDynamicControlsVariable = new HerokuAppDynamicControls(driver, wait);
		    
	}
	
	@Test(priority = 16)
	public void TestCaseVerifyCheckbox() {
		herokuAppDynamicControlsVariable.clickOnCheckBox();
	}
	
	@Test(priority = 17)
	public void TestCaseClickRemoveButton() {
		herokuAppDynamicControlsVariable.clickOnRemoveButton();
	}
	
	@Test(priority = 18)
	public void TestCaseClickAddButton(){
		herokuAppDynamicControlsVariable.clickOnAddButton();
	}
	
	@Test(priority = 19)
	public void TestCaseClickEnableButton() {
		herokuAppDynamicControlsVariable.clickOnEnableButton();
	}
	
	@Test(priority = 20)
	public void TestCaseClickDisableButton() throws InterruptedException {
		herokuAppDynamicControlsVariable.clickOnDisableButton();
	}
	
	
}
