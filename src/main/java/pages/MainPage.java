package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class MainPage extends BasePage { 
	{ 
		url = "http://www.onliner.by"; 
		
	} 
	 
	@FindBy(xpath = "//ul[@class ='b-main-navigation'][1]")
    private GoogleSearchWidget searchWidget;

	@FindBy(xpath = "//span[@class='b-main-navigation__text'][1]")
	public WebElement catalogLink;
	
    public GoogleSearchWidget searchWidget() {
        return searchWidget;
    }
}