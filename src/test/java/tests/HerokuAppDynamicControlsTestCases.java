package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HerokuAppDynamicControls;

public class HerokuAppDynamicControlsTestCases {
	private HerokuAppDynamicControls herokuAppDynamicControlsVariable;
	
	@BeforeClass
	public void setUpDynamicControl() {
		   ((JavascriptExecutor) driver).executeScript("window.open('https://the-internet.herokuapp.com/dynamic_controls', '_blank');");

		// Switch to the new tab
		    for (String windowHandle : driver.getWindowHandles()) {
		        driver.switchTo().window(windowHandle);
		    }
		    
		    
		    herokuAppDynamicControlsVariable = new HerokuAppDynamicControls(driver);
		    
	}
	
	@Test(priority = 16)
	public void TestCaseVerifyCheckbox() {
		herokuAppDynamicControlsVariable.clickOnCheckBox();
	}
	
	
	
}
