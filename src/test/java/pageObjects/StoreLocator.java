package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreLocator {
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/div/div/ul/li[3]/a")
	public static WebElement clickStoreLocator;
	
}
