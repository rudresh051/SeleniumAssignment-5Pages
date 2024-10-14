package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.HerokuAppDynamicContent;

public class HerokuAppDynamicContentTestCases extends BaseTest{
	private HerokuAppDynamicContent herokuAppDynamicContentVariable;
	
	@BeforeClass
	public void setUpDynamicContent() {
		   ((JavascriptExecutor) driver).executeScript("window.open('https://the-internet.herokuapp.com/dynamic_content', '_blank');");
		// Switch to the new tab
		    for (String windowHandle : driver.getWindowHandles()) {
		        driver.switchTo().window(windowHandle);
		    }
		    
		 // Initialize HerokuAppDynamicContent page object
		    herokuAppDynamicContentVariable = new HerokuAppDynamicContent(driver);
	}
	
	@Test(priority = 15)
	public void TestCaseVerifyContent() throws InterruptedException {
		herokuAppDynamicContentVariable.clickOnButton();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	

	
	
	
}
