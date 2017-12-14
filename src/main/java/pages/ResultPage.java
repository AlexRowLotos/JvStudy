package pages;

public class ResultPage extends BasePage { 

	String resultLinkLocator = "(//a[@testid='bib_link'])"; 

	public ResultPage() throws Exception { 
		super(); 
		if (getPageTitle().equalsIgnoreCase("Search | Vancouver Public Library | BiblioCommons") == false) 
			throw new Exception("this is not the results page"); 
	} 
	
	public boolean ref() {
		return true;
	}
} 