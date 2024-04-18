package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Offers;

public class OffersFunction extends CommonFunctions {
	@Test
	public void offers() {
		PageFactory.initElements(driver, Offers.class);
		Offers.clickOffers.click();
		boolean displayed = Offers.image.isDisplayed();
		System.out.println(displayed);
		Offers.copyCode.click();
	}
}
