package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Support {
	@FindBy(xpath = "//li[@class='nav-item ']//a[@class='ps-0'][contains(@href,'https://www.freshma.in/contact-us')]")
	public static WebElement clickSupport;
	@FindBy(xpath = "//input[@type='text'][@class='form-control'][@placeholder='Enter Name']")
	public static WebElement name;
	@FindBy(xpath = "//input[@type='email'][@class='form-control'][@placeholder='Enter mail address']")
	public static WebElement mailAddress;
	@FindBy(xpath = "//input[@type='number'][@class='form-control'][@placeholder='Enter Mobile Number']")
	public static WebElement mobileNumber;
	@FindBy(xpath = "//textarea[@class='form-control']")
	public static WebElement commentBox;
	@FindBy(xpath = "//a[@class='btn btn-primary btn-block']")
	public static WebElement submitButton;
	
}
