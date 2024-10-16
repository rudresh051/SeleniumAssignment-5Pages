package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.HerokuAppDynamicPageElements;

public class HerokuAppDynamicPageElementsTestCases extends BaseTest {
	private HerokuAppDynamicPageElements herokuAppDynamicPageElementsVariable;
	
	@BeforeClass
	public void setUpDynamicPageElements() {
		   ((JavascriptExecutor) driver).executeScript("window.open('https://the-internet.herokuapp.com/dynamic_loading', '_blank');");
		   
		   // Switch to the new tab
		   for (String windowHandle : driver.getWindowHandles()) {
		        driver.switchTo().window(windowHandle);
		    }
		   
		   herokuAppDynamicPageElementsVariable = new HerokuAppDynamicPageElements(driver, wait);
	}
	
	@Test(priority = 21)
	public void TestCaseVerifyElement1() throws InterruptedException {
		herokuAppDynamicPageElementsVariable.clickOnExample1();
	}
	
	@Test(priority = 22)
	public void TestCaseVerifyElement2() throws InterruptedException {
		herokuAppDynamicPageElementsVariable.clickOnExample2();
	}
	
	
	
}
