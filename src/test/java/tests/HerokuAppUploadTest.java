package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.HerokuAppUpload;

public class HerokuAppUploadTest extends BaseTest{
	private HerokuAppUpload herokuAppUploadVariable;
	
	
	@BeforeClass
	public void setUpHerokuApp() {
	   ((JavascriptExecutor) driver).executeScript("window.open('https://the-internet.herokuapp.com/upload', '_blank');");


	 // Switch to the new tab
	    for (String windowHandle : driver.getWindowHandles()) {
	        driver.switchTo().window(windowHandle);
	    }
	    
    // Initialize HerokuAppUpload page object
	    herokuAppUploadVariable = new HerokuAppUpload(driver);
	    
	}
	
	@Test(priority = 14, groups = {"heroku"})
	public void TestCaseVerifyFileUpload() {
		String filePath = "C:\\selsc\\upload_file.png";
		
		herokuAppUploadVariable.uploadFile(filePath);
		
		
	}
	
	
	
	
	
	
}
