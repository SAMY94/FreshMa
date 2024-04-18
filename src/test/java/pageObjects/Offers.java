package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Offers {
	@FindBy(xpath = "//a[@class='ps-0'][@href='https://www.freshma.in/offers']")
	public static WebElement clickOffers;
	@FindBy(xpath = "//img[@src='https://www.freshma.in/media/coupon/2024/03/22/20240322165803_Welcoeme-Bonus-(1200-×-675-px)-(1200-×-475-px)-(5).jpg']")
	public static WebElement image;
	@FindBy(xpath = "//a[@class='btn copyButton btn-outline-primary'][@data-clipboard-target='#code1']")
	public static WebElement copyCode;
}