package TestCases;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.OrderTracking;

public class OrderTrackingFunction extends CommonFunctions {
	@Test
	public void orderTracking() {

		PageFactory.initElements(driver, OrderTracking.class);
		OrderTracking.clickOrderTracking.click();
//		Actions act = new Actions(driver);
//		act.click(OrderTracking.closeTag).build().perform();
		OrderTracking.closeTag.click();
}
}
