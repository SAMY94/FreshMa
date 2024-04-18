package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {
	@FindBy(xpath = "//div[@class='icon d-flex align-items-center']//following::i[@class='feather-user h6 mr-2 mb-0']")
	public static WebElement clickSignIn;
	@FindBy(xpath = "//input[@id='phone_number']")
	public static WebElement mobileNumber;
	@FindBy(xpath = "//button[@id='otpSubmit']")
	public static WebElement submitButton;
	
}
