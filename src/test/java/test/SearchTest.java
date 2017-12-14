package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import static org.testng.Assert.*;
import pages.*;

public class SearchTest { 
	String keyword = "java"; 

	@Test 
	public void testFirstResult() throws Exception { 
		MainPage main = new MainPage(); 
	
		main.load();
		main.catalogLink.click();
		main.load();
	} 

	@BeforeSuite
	public void setUp() { 
		
	} 

	@AfterSuite
	public void tearDown() {
		BasePage.closeBrowser(); 
	} 
}