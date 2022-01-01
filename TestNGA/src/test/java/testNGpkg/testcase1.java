package testNGpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class testcase1 {
	
	WebDriver driver ;
	@Test
	public void f() {
	  
	    String baseUrl = "https://www.google.com/";
	      
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        Reporter.log("using chrome");
	        driver.get(baseUrl);
	        String testTitle = "Google";
	        String originalTitle = driver.getTitle();
	        System.out.println(originalTitle);
	       Assert.assertEquals(originalTitle, testTitle);
	       // Assert.fail();
  }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}

}
