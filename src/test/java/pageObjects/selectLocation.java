package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectLocation {

	@FindBy(xpath = "//button[@class='btn btn-secondary default-store d-block w-100']")
	public static WebElement clickContinueButton;
	
}
