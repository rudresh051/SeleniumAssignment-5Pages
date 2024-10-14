package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;

import pageObjects.HerokuAppDynamicContent;

public class HerokuAppDynamicContentTestCases {
	private HerokuAppDynamicContent herokuAppDynamicContentVariable;
	
	@BeforeClass
	public void setUpHerokuApp() {
	   ((JavascriptExecutor) driver).executeScript("window.open('https://the-internet.herokuapp.com/dynamic_content, '_blank');");


	 // Switch to the new tab
	    for (String windowHandle : driver.getWindowHandles()) {
	        driver.switchTo().window(windowHandle);
	    }
}
