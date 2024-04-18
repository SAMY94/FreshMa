package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search {
	@FindBy(xpath = "//i[@class='feather-search h6 mr-2 mb-0']")
	public static WebElement clickSearch;
	@FindBy(xpath = "//input[@id='searchModalInput']")
	public static WebElement searchInput;
	

}
