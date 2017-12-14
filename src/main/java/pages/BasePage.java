package pages;

import org.junit.Rule; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 

public class BasePage {

	protected static WebDriverWait wait; 
	protected static WebDriver driver; 
	protected String url = "www.google.com";	
	
	{ 
		driver = new ChromeDriver(); 
		wait = new WebDriverWait(driver, 10); 
		PageFactory.initElements(driver, this);
	}


	
	public void load() {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.quit(); 
	}

	public WebElement find(String locator) { 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))); 
	} 

	public void clickElement(String locator) {
		find(locator).click();
	}


	public String getPageTitle() {
		return driver.getTitle();
	} 


	public String getPageUrl() {
		return driver.getCurrentUrl();
	} 

	public void open(String url) { 
		driver.get(url);
	} 


	public void typeText(String locator, String keyword) { 
		find(locator).sendKeys(keyword); 
	} 


	public String getValue(String locator) {
		return find(locator).getText();
	} 


	public Boolean isDisplayed(String locator) { 
		return find(locator).isDisplayed(); 
	} 
}