package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchWidget {
	
	 @FindBy(xpath = "//span[@class='b-main-navigation__text'][1]")
	 public WebElement mailButton;


}
