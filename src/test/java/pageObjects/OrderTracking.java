package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderTracking {
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/div/div/ul/li[4]/a")
	public static WebElement clickOrderTracking;
	@FindBy(xpath = "//button[@id='formclose']//following::span[@aria-hidden='true']")
	public static WebElement closeTag;
	
}
